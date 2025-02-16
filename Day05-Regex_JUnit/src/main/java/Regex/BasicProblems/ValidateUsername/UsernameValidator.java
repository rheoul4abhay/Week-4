package Regex.BasicProblems.ValidateUsername;
import java.util.regex.*;

public class UsernameValidator {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]\\w{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        String[] testUsernames = {"user_123", "123user", "4bh4y", "Abh4y", "@user123", "AbhayIsUsername", "AbhayIsUsername123", "user"};

        for(String username: testUsernames){
            Matcher matcher = pattern.matcher(username);
            System.out.println(username + " ->" + (matcher.matches() ? " valid" : " invalid"));
        }
    }
}
