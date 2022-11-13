package Pereira;

public class Highestscoring {
  /**
   * <i> Given a string of words, you need to find the highest scoring word. Each
   * letter of a word scores points according to its position in the alphabet: a =
   * 1, b = 2, c = 3 etc. You need to return the highest scoring word as a string.
   * If two words score the same, the word that appears earliest in the original
   * string.All letters will be lowercase and all inputs will be valid. </i>
   */
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
