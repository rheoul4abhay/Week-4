package Regex.AdvancedProblems.ExtractProgrammingLanguagesNames;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractProgrammingLanguageNames {

    public static List<String> extractLanguages(String text) {
        String[] programmingLanguages = {"Java", "JavaScript", "C", "C#", "C++", "Python", "Rust", "Ruby", "Go", "PHP", "Swift"};
        String regex = "\\b(" + String.join("|", programmingLanguages) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> extractedLanguages = new ArrayList<>();
        while (matcher.find()) {
            extractedLanguages.add(matcher.group());
        }
        return extractedLanguages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> extractedLanguages = extractLanguages(text);
        System.out.println("Extracted languages from text -> " + String.join(", ", extractedLanguages));
    }
}
