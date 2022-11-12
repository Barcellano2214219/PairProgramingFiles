public class PerfectSquare {
    public static long findNextSquare(long sq) {
        long num;
        double d = Math.sqrt(sq);

        if ( d % 1  == 0) {
            num = (long) Math.pow(++d, 2);
        } else num = -1;

        return num;   //usename: Benedict1869

    }
}