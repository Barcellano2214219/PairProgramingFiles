public class Factorial {
    public int factorial(int n) {
        if (n == 0)
            return 1;

        if (n < 1 || n > 12)
            throw new IllegalArgumentException();   // username:Benedict1869

        return n * factorial(n - 1);

    }
}