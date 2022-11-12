public class DivisibleNb {
    // 8 kyu
    // Is n divisible by x and y?
    public static Boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }
}
