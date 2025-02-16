package Regex.ReplaceAndModifyStrings.ReplaceMultipleSpaceWithSingleSpace;

import java.util.regex.*;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "This    is  an  example  with   multiple spaces   . ";
        String regex = "\\s+";

        String replacedText = text.replaceAll(regex, " ");
        System.out.println("Original String -> " + text);
        System.out.println("Formatted String -> " + replacedText);
    }
}
