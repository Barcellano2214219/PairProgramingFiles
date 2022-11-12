package Group18_Barcellano;

public class disemvowelTrolls {
    public static String disemvowelTrolls(String s) {
        s = (s.replaceAll("[aeiouAEIOU]", ""));
        return s;
    }
}
