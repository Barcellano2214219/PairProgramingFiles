package Group18_Barcellano;

import java.util.HashMap;

public class scramblies {
    public static boolean scramblies(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray())
            map.put(ch, 1 + map.getOrDefault(ch, 0));
        for (char ch : str2.toCharArray()) {
            Integer count = map.getOrDefault(ch, 0);
            if (count == 0)
                return false;
            map.put(ch, --count);
        }
        return true;
    }
}
