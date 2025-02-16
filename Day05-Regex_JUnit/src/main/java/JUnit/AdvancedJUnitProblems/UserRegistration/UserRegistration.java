package JUnit.AdvancedJUnitProblems.UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static String registerUser(String username, String email,String password){
        String username_regex = "^[a-zA-Z]\\w{4,14}"; //At max 15 characters long username, starting with a letter
        String email_regex = "\\b[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}\\b";
        String password_regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        if((username ==  null) || username.trim().isEmpty() || !Pattern.matches(username_regex, username)) {
            throw new IllegalArgumentException("Invalid username");
        }
        if((email == null) || email.trim().isEmpty() || !Pattern.matches(email_regex, email)){
            throw new IllegalArgumentException("Invalid email");
        }
        if((password == null) || password.trim().isEmpty() || !Pattern.matches(password_regex, password)){
            throw new IllegalArgumentException("Invalid password");
        }
        return "User registered Successfully : " + username + " | " + email + " | " + password;
    }
    public static void main(String[] args) {
        try {
            System.out.println(registerUser("JohnDoe", "john.doe@example.com", "Password@123"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
