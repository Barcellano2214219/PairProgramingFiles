package Pereira;

public class getmiddle {
    /**
     * <i> Finds the middle part. </i>
     */
    public static String getMiddle(String word) {
        int wordCount = word.length();
        int middleWord = wordCount / 2;

        if (wordCount % 2 != 0) { // if number of letters in a string is odd
            return word.substring(middleWord, middleWord + 1);
        } else if (wordCount == 1) { // if string only have one letter
            return word.substring(wordCount - 1);
        } else { // if number of letters in a string is even
            return word.substring(middleWord - 1, middleWord + 1);
        }
    }

}