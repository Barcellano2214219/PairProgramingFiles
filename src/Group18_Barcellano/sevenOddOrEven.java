package Group18_Barcellano;

public class sevenOddOrEven {
    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }
}
