/**
 * this program returns the middle character of the word.
 * If the word's length is odd, return the middle character.
 * If the word's length is even, return the middle 2 characters.
 */
package Fiona;

class getmiddle {
    public static String getMiddle(String word) {
        // Code goes here!
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