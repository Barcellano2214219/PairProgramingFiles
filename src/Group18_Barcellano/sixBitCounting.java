package Group18_Barcellano;

public class sixBitCounting {
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
