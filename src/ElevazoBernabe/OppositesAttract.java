package ElevazoBernabe;

public class OppositesAttract {
    /**
     * <i> Creates a function that will take the number of petals of each flower and
     * return true if they are in love and false if they aren’t. </i>
     */
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 + flower2) % 2 != 0;

    }

}