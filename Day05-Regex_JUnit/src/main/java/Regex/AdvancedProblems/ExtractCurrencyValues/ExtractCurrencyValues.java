package Regex.AdvancedProblems.ExtractCurrencyValues;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractCurrencyValues {

    public static List<String> extractCurrencyValues(String text) {
        String regex = "[₹$€£¥]?\\d{1,3}(,\\d{3})*(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }
        return currencyValues;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, the discount is 10.50, and the total is €1,200 or ₹500.";
        List<String> extractedValues = extractCurrencyValues(text);
        System.out.println("Extracted currency values -> " + String.join(", ", extractedValues));
    }
}
