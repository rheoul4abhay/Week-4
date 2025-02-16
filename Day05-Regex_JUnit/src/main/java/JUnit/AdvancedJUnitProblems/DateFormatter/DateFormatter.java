package JUnit.AdvancedJUnitProblems.DateFormatter;
import java.util.regex.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatter {

    public static String formatDate(String inputDate) {
        if (inputDate == null) {
            return "Invalid date";
        }

        String date_regex = "^(\\d{4})-(\\d{2})-(\\d{2})$";
        Pattern pattern = Pattern.compile(date_regex);
        Matcher matcher = pattern.matcher(inputDate);

        if (matcher.matches()) {
            return matcher.group(3) + "-" + matcher.group(2) + "-" + matcher.group(1);
        } else {
            return "Invalid date";
        }
    }

    public static void main(String[] args) {
        String validDate = "2024-02-17";
        String invalidDate = "17-02-2024";

        System.out.println("Formatted Date (Valid): " + formatDate(validDate));
        System.out.println("Formatted Date (Invalid): " + formatDate(invalidDate));
    }
}
