package JUnitTests.AdvancedProblemsTests;

import JUnit.AdvancedJUnitProblems.UserRegistration.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    public void testValidRegistration() {
        // Arrange
        String username = "JohnDoe";
        String email = "john.doe@example.com";
        String password = "Password@123";

        // Act
        String result = UserRegistration.registerUser(username, email, password);

        // Assert
        assertTrue(result.contains("User registered Successfully"));
    }

    @Test
    public void testInvalidUsername() {
        // Arrange
        String username = "JD";
        String email = "john.doe@example.com";
        String password = "Password@123";

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(username, email, password));
    }

    @Test
    public void testInvalidEmail() {
        // Arrange
        String username = "JohnDoe";
        String email = "john.doe@invalid";
        String password = "Password@123";

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(username, email, password));
    }

    @Test
    public void testInvalidPassword() {
        // Arrange
        String username = "JohnDoe";
        String email = "john.doe@example.com";
        String password = "weakpass";

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(username, email, password));
    }
}
