package Regex.ReplaceAndModifyStrings.CensorBadWordsInSentence;

import java.util.regex.Pattern;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid"};

        for(String badWord: badWords){
            String regex = "\\b" + Pattern.quote(badWord) + "\\b";
            String replacement = "*".repeat(badWord.length());
            text = text.replaceAll(regex, replacement);
        }
        System.out.println(text);
    }
}
