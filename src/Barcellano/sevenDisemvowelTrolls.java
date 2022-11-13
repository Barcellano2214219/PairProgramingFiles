package Barcellano;

public class sevenDisemvowelTrolls {
    /*
     * <i> The task is to write a function that takes a string and return a new
     * string
     * with all vowels removed. </i>
     */
    public static String disemvowelTrolls(String s) {
        s = (s.replaceAll("[aeiouAEIOU]", ""));
        return s;
    }
}
