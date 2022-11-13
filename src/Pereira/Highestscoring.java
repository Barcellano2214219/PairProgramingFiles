package Pereira;

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
