package Regex.ExtractionProblems.ExtractCapitalizedWordsInSentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //To store all capitalized words
        List<String> words = new ArrayList<>();
        while(matcher.find()){
            words.add(matcher.group());
        }
        System.out.println("Extracted Capitalized words : " + String.join(", ", words));
    }
}
