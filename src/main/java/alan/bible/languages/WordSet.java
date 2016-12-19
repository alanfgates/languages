package alan.bible.languages;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * Created by gates on 5/22/15.
 */
public class WordSet {
  private final List<Word> words;
  private Map<Integer, Word> offsetMap;
  private Set<Word> used;
  private int maxOffset;

  public WordSet(List<Word> words) {
    this.words = words;
  }

  Word getNextWord(Random rand) {
    while (true) {
      if (offsetMap.isEmpty()) return null; // We're out of words
      int pos = rand.nextInt(maxOffset);
      Word word = offsetMap.get(pos);
      // Look to see if we've already returned this word but under a different position.  If so
      // remove this position and set the word to null so we try something different.
      if (used.contains(word)) {
        offsetMap.remove(pos);
        word = null;
      }
      // Word could be null because we've already removed that position or because we've just
      // found we already returned that word so we just set it to null.  Either way, choose a new
      // random number and go again.
      if (word == null) continue;
      used.add(word);
      return word;
    }
  }

  void prepareForTestRun() {
    offsetMap = new HashMap<>(words.size());
    int nextOffset = 0;

    for (Word word : words) {
      for (int i = 0; i < word.getOccurrences(); i++, nextOffset++) {
        Word previous = offsetMap.put(nextOffset, word);
        if (previous != null) throw new RuntimeException("Woh, way bad!");
      }
    }
    maxOffset = nextOffset;

    used = new HashSet<>();
  }

  void dumpOccurrences() {
    for (Word word : words) {
      System.out.println(word.getInitial().first + ":" + word.getOccurrences());
    }
  }

  List<Word> getWords() {
    return words;
  }
}
