package JUnit.AdvancedJUnitProblems.PasswordStrengthValidator;

import java.util.regex.*;
public class PasswordValidator {

    public static boolean isValidPassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return password != null && matcher.matches();
    }
    public static void main(String[] args) {
        String[] testPasswords = {
                "Password1",
                "short1",
                "nouppercase1",
                "NOLOWERCASE1",
                "NoDigitsHere",
                "Valid123A"
        };

        for(String password : testPasswords){
            System.out.println(password + " -> " + (isValidPassword(password) ? "valid" : "invalid"));
        }
    }
}
