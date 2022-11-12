package Fiona;

public class pileofcubes {

  public static long findNb(long m) {
    // your code
    int count = 0;
    do {
      m = m - (long) Math.pow(count++ + 1d, 3d);
    } while (m > 0);

    return (m == 0) ? count : -1;
  }
}