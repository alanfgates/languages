package alan.bible.languages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SpreadsheetDumper {

  final private static int OCCURRENCE_SIZING_FACTOR = 10; // How we size down the word occurrence
  final private static int MAX_OCCURRENCE_VERB = 8; // maximum number of times to put a verb in the list
  final private static int MAX_OCCURRENCE_WORD = 20; // maximum number of times to put a word in the list

  /**
   * Dump the words into a spreadsheet
   * @param dirname directory to write the file into
   * @param fileSize number of entries to write per file
   * @param languages which languages to do
   * @throws IOException if something goes wrong
   */
  void dump(String dirname, int fileSize, Language... languages) throws IOException {
    List<String> lines = new ArrayList<>();
    for (Language language : languages) {
      // We take 100 as the base number of occurences and put the word in for each time it
      // occurs / 100.  We'll rotate through different forms of the word, making sure we put
      // each form in at least once.

      dumpOneWordSet(language.getInitialVerbs(), MAX_OCCURRENCE_VERB, lines);
      dumpOneWordSet(language.getInitialVocabulary(), MAX_OCCURRENCE_WORD, lines);
    }

    // Randomly write the resulting lines into files of fileSize entries each.
    Random rand = new Random();
    int filenum = 1;
    while (!lines.isEmpty()) {
      File file = new File(dirname + System.getProperty("file.separator") + "Language " +
          filenum++ + ".csv");
      try (FileWriter writer = new FileWriter(file)) {
        Set<String> beenThereDoneThat = new HashSet<>(fileSize);
        for (int i = 0; i < fileSize && !lines.isEmpty(); i++) {
          int entry = rand.nextInt(lines.size());
          if (beenThereDoneThat.add(lines.get(entry))) {
            writer.write(lines.get(entry));
          }
          lines.remove(entry);
        }
      }
    }
  }
private void dumpOneWordSet(WordSet words, int maxWordOccurrence, List<String> lines)
      throws IOException {
    for (Word word : words.getWords()) {
      int timesToWrite = word.getOccurrences() / OCCURRENCE_SIZING_FACTOR;
      timesToWrite = Math.max(1, timesToWrite);
      timesToWrite = Math.min(maxWordOccurrence, timesToWrite);  // there's a limit
      for (int i = 0; i < timesToWrite; i++) {
        for (WordInstance instance : word.getInstances()) {
          lines.add(instance.first + '\t' + instance.second + '\n');
        }
      }
    }
  }
}
