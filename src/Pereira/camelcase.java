package Pereira;

public class camelcase {
    /**
     * <i> Write simple .camelCase method (camel_case function in PHP, CamelCase in
     * C# or camelCase in Java) for strings. All words must have their first letter
     * capitalized without spaces. </i>
     */
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