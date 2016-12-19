package me.gates.alan.languages;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gates on 5/22/15.
 */
public abstract class Language {

  protected WordSet grammarRules;
  protected WordSet verbs;
  protected WordSet nouns;
  protected WordSet vocabulary;

  public abstract String getName();

  final public WordSet getGrammarRules() {
    if (grammarRules == null) grammarRules = getInitialGrammarRules();
    if (grammarRules != null) grammarRules.prepareForTestRun();
    return grammarRules;
  }

  abstract public WordSet getInitialGrammarRules();

  final public WordSet getVerbs() {
    if (verbs == null) verbs = getInitialVerbs();
    if (verbs != null) verbs.prepareForTestRun();
    return verbs;
  }

  abstract public WordSet getInitialVerbs();

  final public WordSet getNouns() {
    if (nouns == null) nouns = getInitialNouns();
    if (nouns != null) nouns.prepareForTestRun();
    return nouns;
  }

  abstract public WordSet getInitialNouns();

  final public WordSet getVocabulary() {
    if (vocabulary == null) vocabulary = getInitialVocabulary();
    if (vocabulary != null) vocabulary.prepareForTestRun();
    return vocabulary;
  }

  abstract public WordSet getInitialVocabulary();

  protected interface AbbreviationDecoder {
    String decode(String answer);
  }

  protected void addWord(List<Word> words,
                         AbbreviationDecoder appender,
                         int occurrences,
                         String ... vals) {
    if (vals.length % 2 != 0) {
      throw new RuntimeException("Uneven number of words for line beginning " + vals[0]);
    }
    List<WordInstance> instances = new ArrayList<>();
    for (int i = 0; i < vals.length; i += 2) {
      String answer = (appender == null) ? vals[i + 1] : appender.decode(vals[i + 1]);
      instances.add(new WordInstance(vals[i], answer));
    }
    words.add(new Word(occurrences, instances.toArray(new WordInstance[instances.size()])));
  }
}
