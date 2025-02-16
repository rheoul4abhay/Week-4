package Regex.ExtractionProblems.ExtractWebpageLinks;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractWebpageLinks {

    public static List<String> extractLinks(String text) {
        String regex = "\\bhttps?://[\\w.-]+\\.[a-zA-Z]{2,6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> extractedLinks = extractLinks(text);
        System.out.println("Extracted Links: " + String.join(", ", extractedLinks));
    }
}
