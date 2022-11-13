package Pereira;

public class camelcase {
    public static String camelCase(String input) {

        String spacedWord = "";

        for (int i = 0; i < input.length(); i++) {
            String word = Character.toString(input.charAt(i));
            if (word.equals(word.toUpperCase())) {
                spacedWord += " ";
            }
            spacedWord += word;
        }

        return spacedWord;
    }
}