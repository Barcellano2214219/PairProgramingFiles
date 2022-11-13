package ElevazoBernabe;

public class Move {
    /**
     * <i> Creates a function for the terminal game that takes the current position
     * of the hero and the roll (1-6) and returns the new position. </i>
     */
    public static int move(int position, int roll) {
        return position + roll * 2;
    }
}
