package Annotations.CustomAnnotations.IntermediateLevel.RestrictMaximumStringLength;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > this.getClass().getDeclaredFields()[0].getAnnotation(MaxLength.class).value()) {
            throw new IllegalArgumentException("Username exceeds maximum length.");
        }
        this.username = username;
    }
}

public class RestrictMaxStringLength {
    public static void main(String[] args) {
        try {
            User user = new User("LongUsername");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}