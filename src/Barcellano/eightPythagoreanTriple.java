package Barcellano;

public class eightPythagoreanTriple {
    /**
     * <i> Given an array of 3 non-negative integers a, b and c, determine if they
     * form a pythagorean triple.
     * A pythagorean triple is formed when:
     * Formula: c^2 = a^2 + b^2.
     * Where c is the largest value of a, b, c.
     * For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 5^2 =
     * 3^2 + 4^2 </i>
     */
    public static int pythagoreanTriple(int[] triple) {
        if (triple[2] < triple[1] || triple[2] < triple[0]) {
            return 0;
        }
        if (triple[2] * triple[2] == (triple[0] * triple[0]) + (triple[1] * triple[1])) {
            return 1;
        }
        return 0;
    }
}
