package Fiona;

public class complement {
  public static String makeComplement(String dna) {
    // Your code
    StringBuilder complement = new StringBuilder();

    for (int i = 0; i < dna.length(); i++) {
      if (dna.charAt(i) == 'T') {
        complement.append('A');
      }
      if (dna.charAt(i) == 'A') {
        complement.append('T');
      }
      if (dna.charAt(i) == 'C') {
        complement.append('G');
      }
      if (dna.charAt(i) == 'G') {
        complement.append('C');
      }
    }
    return complement.toString();
  }
}