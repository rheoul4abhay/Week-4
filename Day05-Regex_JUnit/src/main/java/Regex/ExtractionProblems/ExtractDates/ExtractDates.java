package Regex.ExtractionProblems.ExtractDates;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractDates {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex = "\\b(0[1-9]|[12][0-9]|[3][01])/(0[1-9]|[1][0-2])/(\\d{4})\\b"; //improvised date extraction regex to allow only valid dates and months

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> dates = new ArrayList<>();
        while(matcher.find()){
            dates.add(matcher.group());
        }
        System.out.println("Extracted dates : " + String.join(", ",dates));
    }
}
