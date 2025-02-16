package Regex.ExtractionProblems.ExtractCapitalizedWordsInSentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractCapitalizedWords {

    public static List<String> extractWords(String text) {
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> capitalizedWords = extractWords(text);
        System.out.println("Extracted Capitalized Words: " + String.join(", ", capitalizedWords));
    }
}
