package Regex.BasicProblems.ValidateUsername;
import java.util.regex.*;

public class UsernameValidator {

    public static boolean isValidUsername(String name){
        String regex = "^[a-zA-Z]\\w{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "123user", "4bh4y", "Abh4y", "@user123", "AbhayIsUsername", "AbhayIsUsername123", "user"};

        for(String username: testUsernames){
            System.out.println(username + " ->" + (isValidUsername(username) ? " valid" : " invalid"));
        }
    }
}
