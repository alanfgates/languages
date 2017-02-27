package alan.bible.languages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gates on 5/22/15.
 */
class Engine {
  private final Random rand;
  private final int grammarRules;
  private final int nouns;
  private final int verbs;
  private final int numToTest;
  private BufferedReader reader;

  Engine(Random r, int gr, int n, int v, int toTest) {
    rand = r;
    grammarRules = gr;
    nouns = n;
    verbs = v;
    numToTest = toTest;
    reader = new BufferedReader(new InputStreamReader(System.in));
  }

  void run(Language... languages) throws IOException {
    while (true) {
      for (int i = 0; i < languages.length; i++) {
        System.out.println("Starting " + languages[i].getName());
        test("Grammar rules", grammarRules, languages[i].getGrammarRules());
        test("Nouns", nouns, languages[i].getNouns());
        test("Verbs", verbs, languages[i].getVerbs());
        test("Vocabulary", numToTest, languages[i].getVocabulary());
        System.out.println("Finished with " + languages[i].getName());
      }
      System.out.println("Finished, press enter to go again");
      String answer = reader.readLine();
      if (answer.length() > 0 && answer.toLowerCase().charAt(0) == 'd') {
        System.out.println("Dumping occurrences for " + languages[0].getName());
        languages[0].getVocabulary().dumpOccurrences();
      }
    }
  }

  static Language findLanguage(String language) {
    StringBuilder langName = new StringBuilder();
    langName.append(language.toUpperCase().charAt(0));
    langName.append(language.toLowerCase().substring(1));
    String className = "alan.bible.languages.language." + langName.toString();
    try {
      Class<? extends Language> clz = (Class<? extends Language>)Class.forName(className);
      return clz.newInstance();
    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
      throw new RuntimeException(e);
    }
  }

  private void test(String type, int toTest, WordSet words) throws IOException {
    if (toTest == 0) {
      System.out.println("Skipping " + type);
      return;
    }
    if (words == null) {
      System.out.println("No words found for " + type);
      return;
    } else {
      System.out.println("Beginning " + type);
    }


    List<WordInstance> instances = new ArrayList<>(toTest);
    for (int i = 0; i < toTest; i++) {
      Word word = words.getNextWord(rand);
      if (word == null) {
        // We've run out of words, we're done
        break;
      }
      instances.add(word.getInstance(rand));
    }
    int timesThrough = 0;
    while (instances.size() > 0) {
      if (timesThrough++ > 0) System.out.println("Take " + timesThrough);
      int beforeCnt = instances.size();
      instances = onceThrough(instances, timesThrough == 1);
      if (instances.size() == 0) System.out.println("100%");
      else System.out.println(((1.0 - (double)instances.size()/beforeCnt)*100.0) + "%");
    }
    System.out.println("Done with " + type);
  }

  private List<WordInstance> onceThrough(List<WordInstance> instances, boolean firstTime)
      throws  IOException {
    List<WordInstance> failed = new ArrayList<>();
    for (WordInstance instance : instances) {
      System.out.print(instance.first);
      reader.readLine();
      System.out.println(instance.second);
      System.out.println("Success ?");
      String answer = reader.readLine();
      if (answer.length() > 0 && answer.toLowerCase().charAt(0) != 'y') {
        failed.add(instance);
        if (firstTime) instance.word.adjustForFail();
      } else {
        if (firstTime) instance.word.adjustForSuccess();
      }
    }
    return failed;
  }
}
