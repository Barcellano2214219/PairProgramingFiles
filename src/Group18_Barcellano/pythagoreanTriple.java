package Group18_Barcellano;

public class pythagoreanTriple {
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
