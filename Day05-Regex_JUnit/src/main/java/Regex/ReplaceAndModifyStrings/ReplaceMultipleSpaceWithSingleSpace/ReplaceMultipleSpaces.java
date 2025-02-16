package Regex.ReplaceAndModifyStrings.ReplaceMultipleSpaceWithSingleSpace;

import java.util.regex.*;

public class ReplaceMultipleSpaces {

    public static String replaceMultipleSpaces(String text) {
        String regex = "\\s+";
        return text.replaceAll(regex, " ");
    }

    public static void main(String[] args) {
        String text = "This    is  an  example  with   multiple spaces   . ";
        System.out.println("Original String -> " + text);
        System.out.println("Formatted String -> " + replaceMultipleSpaces(text));
    }
}
