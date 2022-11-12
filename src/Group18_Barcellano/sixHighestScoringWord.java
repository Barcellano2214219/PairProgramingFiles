package Group18_Barcellano;

import java.util.ArrayList;

public class sixHighestScoringWord {
    public static String highestScoringWord(String s) {
        String[] strArr = s.split(" ");
        String highestValueStr = "";
        int highestValue = 0;

        for (String str : strArr) {
            char[] letters = str.toCharArray();
            int wordValue = 0;

            for (char lttr : letters) {
                ArrayList<Character> alphabet = getArrOfChars();
                wordValue = wordValue + alphabet.indexOf(lttr) + 1;
            }

            if (highestValue < wordValue) {
                highestValue = wordValue;
                highestValueStr = str;
            }
        }
        return highestValueStr;
    }

    public static ArrayList<Character> getArrOfChars() {
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        return alphabet;
    }
}
