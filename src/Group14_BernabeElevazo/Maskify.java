public class Maskify {
    // 7kyu
    // Credit Card Mask
    public static String maskify(String str) {
        if(str.length() < 4) return str;

        int masked = str.length()-4;
        String result = "";

        for (int i= 0; i < masked; i++) result+="#";
        result +=str.substring(masked);

        return result;
    }
}
