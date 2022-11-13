package Barcellano;

public class sixBitCounting {
    /**
     * <i> Function that takes an integer as input, and returns the number of bits
     * that
     * are equal to one in the binary representation of that number.
     * You can guarantee that input is non-negative.
     * Example: The binary representation of 1234 is 10011010010, so the function
     * should return 5 in this case. </i>
     */
    public static int bitCounting(int n) {
        String binaryRep = Integer.toBinaryString(n);
        String[] binaryArray = binaryRep.split("");
        int counter = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (Integer.parseInt(binaryArray[i]) == 1) {
                counter++;
            }
        }
        return counter;
    }
}
