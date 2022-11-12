import java.lang.Math;
public class Array {
    // 8 kyu
    // Sum of positive
    public static int[] digitize(long n) {
        String string = String.valueOf(n);
        int length = string.length();
        int[] Arr = new int[length];
        for ( int i = 0; i < length; i++){
            Arr[i] = (int) (string.charAt(length - i - 1)) - 48;
        }
        return Arr;
    }
}
