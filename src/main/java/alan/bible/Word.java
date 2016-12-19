package me.gates.alan.languages;

import java.util.Random;

/**
 * Created by gates on 5/22/15.
 */
public class Word {
  private int occurrences;
  private WordInstance[] instances;
  private int adjustment;

  public Word(int occurrences, WordInstance... instances) {
    this.occurrences = occurrences;
    this.instances = instances;
    for (WordInstance instance : this.instances) instance.word = this;
  }

  int getOccurrences() {
    return occurrences + adjustment;
  }

  WordInstance getInstance(Random rand) {
    return instances[rand.nextInt(instances.length)];
  }

  WordInstance getInitial() {
    return instances[0];
  }

  WordInstance[] getInstances() {
    return instances;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Word)) return false;
    Word that = (Word)other;
    return this.instances[0].equals(that.instances[0]);
  }

  @Override
  public int hashCode() {
    return occurrences;
  }

  public void adjustForFail() {
    if (adjustment < 0) adjustment = 0;
    else adjustment += occurrences / 20;
  }

  public void adjustForSuccess() {
    adjustment -= occurrences / 20;
    if (occurrences + adjustment < 0) adjustment = -1 * (occurrences - 1);
  }
}
