package me.gates.alan.languages;

/**
 * Created by gates on 5/22/15.
 */
public class WordInstance {

  final String first;
  final String second;
  Word word; // Back pointer to the word this instance came from

  public WordInstance(String f, String s) {
    first = f;
    second = s;
    word = null;
  }
}
