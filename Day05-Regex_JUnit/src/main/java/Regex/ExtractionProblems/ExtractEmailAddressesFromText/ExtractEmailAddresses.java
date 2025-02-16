package Regex.ExtractionProblems.ExtractEmailAddressesFromText;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractEmailAddresses {

    public static List<String> extractEmails(String text) {
        String regex = "\\b[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> extractedEmails = extractEmails(text);
        System.out.println("Extracted Emails: " + String.join(", ", extractedEmails));
    }
}
