package ElevazoBernabe;

public class Maskify {
    /**
     * <i> You must write a function maskify, which changes all but the last four
     * characters into #. </i>
     */
    public static String maskify(String str) {
        if (str.length() < 4)
            return str;

        int masked = str.length() - 4;
        String result = "";

        for (int i = 0; i < masked; i++)
            result += "#";
        result += str.substring(masked);

        return result;
    }
}
