package Regex.AdvancedProblems.ValidateCreditCardNumber;

import java.util.regex.Pattern;

public class ValidateCreditCard {

    public static boolean isValidCreditCard(String cardNumber) {
        String visaPattern = "^4\\d{15}$";
        String masterPattern = "^5\\d{15}$";

        return Pattern.matches(visaPattern, cardNumber) || Pattern.matches(masterPattern, cardNumber);
    }

    public static void main(String[] args) {
        String[] testCards = {
                "4111111111111111",
                "5500000000000004",
                "4222222222222",
                "5111111111111118",
                "6011000000000000",
                "520000000000000",
                "4000000000000000"
        };

        for (String card : testCards) {
            System.out.println(card + " -> " + (isValidCreditCard(card) ? "valid" : "invalid"));
        }
    }
}
