package Regex.ReplaceAndModifyStrings.CensorBadWordsInSentence;

import java.util.regex.Pattern;

public class CensorBadWords {

    public static String censorText(String text, String[] badWords) {
        for (String badWord : badWords) {
            String regex = "\\b" + Pattern.quote(badWord) + "\\b";
            String replacement = "*".repeat(badWord.length());
            text = text.replaceAll(regex, replacement);
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        System.out.println(censorText(text, badWords));
    }
}
