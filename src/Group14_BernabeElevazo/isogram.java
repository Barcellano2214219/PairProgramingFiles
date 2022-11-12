import java.util.*;
public class isogram {
    // 7 kyu
    // Isograms
    public static boolean  isIsogram(String str) {
        boolean isogram = true;
        HashSet set = new HashSet();
        for(char c : (str.toLowerCase()).toCharArray()){
            if(set.add(c) == false){
                isogram = false;
                return false;
            }
        }
        return isogram;
    }
}