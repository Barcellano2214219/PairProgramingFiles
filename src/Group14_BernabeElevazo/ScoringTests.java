public class ScoringTests {

    public static int sol(int[] arr, int r, int o, int w) {
        int points[] = new int[] {r, o, -w};
        int score = 0;

        for (int i : arr) {
            score += points[i];
        }

        return score;
    }
}