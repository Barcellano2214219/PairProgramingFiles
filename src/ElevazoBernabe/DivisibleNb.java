package ElevazoBernabe;

public class DivisibleNb {
    /**
     * <i> Creates a function that checks if a number n is divisible by two numbers
     * x and y. All inputs are positive, non-zero numbers. </i>
     */
    public static Boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }
}
