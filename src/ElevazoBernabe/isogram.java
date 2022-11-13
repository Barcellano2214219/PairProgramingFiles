package ElevazoBernabe;

import java.util.*;

public class isogram {
    /**
     * <i> An Isogram is a word that has no repeating letters, consecutive or
     * nonconsecutive. Implement a function that determines whether a string that
     * contains only letters is an isogram. Assume the empty string is an isogram.
     * Ignore letter case. </i>
     */
    public static boolean isIsogram(String str) {
        boolean isogram = true;
        HashSet set = new HashSet();
        for (char c : (str.toLowerCase()).toCharArray()) {
            if (set.add(c) == false) {
                isogram = false;
                return false;
            }
        }
        return isogram;
    }
}