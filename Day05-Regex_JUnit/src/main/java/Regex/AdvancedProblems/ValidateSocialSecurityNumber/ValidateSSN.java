package Regex.AdvancedProblems.ValidateSocialSecurityNumber;
import java.util.regex.*;

public class ValidateSSN {

    public static boolean isValidSSN(String ssn){
        String regex = "^(\\d{3}-\\d{2}-\\d{4})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] textSSNs = {
                "123-45-6789",
                "123456789",
                "12-345-6789",
                "123-4-6789",
                "123-45-678",
                "abc-de-ghij",
                "000-12-3456"
        };

        for(String ssn: textSSNs){
            System.out.println(ssn + " -> " + (isValidSSN(ssn) ? "valid" : "invalid"));
        }
    }
}
