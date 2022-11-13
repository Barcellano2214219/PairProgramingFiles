package Pereira;

public class complement {
  /**
   * <i> Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells
   * and carries the "instructions" for the development and functioning of living
   * organisms.In DNA strings, symbols "A" and "T" are complements of each other,
   * as "C" and "G". Your function receives one side of the DNA (string, except
   * for Haskell); you need to return the other complementary side. DNA strand is
   * never empty or there is no DNA at all (again, except for Haskell). </i>
   */
  public static String makeComplement(String dna) {
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