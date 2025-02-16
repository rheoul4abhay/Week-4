package Regex.ExtractionProblems.ExtractWebpageLinks;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractWebpageLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "\\bhttps?://[\\w.-]+\\.[a-zA-Z]{2,6}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //To store extracted links
        List<String> links = new ArrayList<>();
        while(matcher.find()){
            links.add(matcher.group());
        }

        //print extracted links
        System.out.println("Extracted links : " + String.join(", ", links));
    }
}
