package Regex.ExtractionProblems.ExtractEmailAddressesFromText;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractEmailAddresses {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        String regex = "\\b[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
