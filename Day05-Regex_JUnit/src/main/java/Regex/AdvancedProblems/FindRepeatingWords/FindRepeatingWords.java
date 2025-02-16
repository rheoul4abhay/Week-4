package Regex.AdvancedProblems.FindRepeatingWords;

import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {

    public static List<String> findRepeatingWords(String text) {
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeatingWords = new LinkedHashSet<>();
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        return new ArrayList<>(repeatingWords);
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test";
        List<String> repeatedWords = findRepeatingWords(text);
        System.out.println("Repeated words -> " + String.join(", ", repeatedWords));
    }
}
