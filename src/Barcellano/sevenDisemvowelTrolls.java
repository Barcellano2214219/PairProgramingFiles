package Barcellano;

public class sevenDisemvowelTrolls {
    public static String disemvowelTrolls(String s) {
        s = (s.replaceAll("[aeiouAEIOU]", ""));
        return s;
    }
}
