package Barcellano;

/*
 * Given a list of integers, determine whether the sum of its elements is odd or even.
 * Give your answer as a string matching "odd" or "even".
 * If the input array is empty consider it as: [0] (array with a zero).
 */

public class sevenOddOrEven {
    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }
}
