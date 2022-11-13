package Barcellano;

/*
 * Given an array(list) strarr of strings and an integer k. 
 * The task is to return the first longest string consisting of k consecutive strings taken in the array.
 */

public class sixConsecutiveStrings {
    public static String consecutiveStrings(String[] starr, int k) {
        String finResult = "";

        for (int i = k - 1; i < starr.length; i++) {
            String currResult = "";
            int iteration = i;

            while (iteration >= i - (k - 1)) {
                currResult = starr[iteration].concat((currResult));
                iteration--;
            }
            if (currResult.length() > finResult.length()) {
                finResult = currResult;
            }
        }
        return finResult;
    }
}
