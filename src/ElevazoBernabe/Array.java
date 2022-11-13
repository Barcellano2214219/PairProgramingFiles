package ElevazoBernabe;

import java.lang.Math;

public class Array {
    /**
     * <i> You get an array of numbers, and return the sum of all the positive ones.
     * </i>
     */
    public static int[] digitize(long n) {
        String string = String.valueOf(n);
        int length = string.length();
        int[] Arr = new int[length];
        for (int i = 0; i < length; i++) {
            Arr[i] = (int) (string.charAt(length - i - 1)) - 48;
        }
        return Arr;
    }
}
