/**
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 *
 * this program returns the highest scoring word as a string.
 *
 * If two words score the same, return the word that appears earliest in the original string.
 *
 * All letters will be lowercase and all inputs will be valid.
 */
package Fiona;

public class Highestscoring {
  public static String high(String s) {
    String highScoreWord = "";
    int highScore = 0;

    for (String splitWord : s.split(" ")) {
      int scoreOfWord = 0;

      for (char c : splitWord.toCharArray()) {
        scoreOfWord += (c - 96);

      }

      if (scoreOfWord > highScore) {

        highScore = scoreOfWord;
        highScoreWord = splitWord;

      }
      // Your code here...

    }
    return highScoreWord;

  }
}
