package Barcellano;

/*
 * The task is to write a function that takes a string and return a new string with all vowels removed.
 */

public class sevenDisemvowelTrolls {
    public static String disemvowelTrolls(String s) {
        s = (s.replaceAll("[aeiouAEIOU]", ""));
        return s;
    }
}
