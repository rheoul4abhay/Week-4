package RegexTests.BasicProblemsTests;

import Regex.BasicProblems.ValidateUsername.UsernameValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsernameValidatorTest {

    @Test
    public void testValidUsernames() {
        // Arrange
        String validUsername = "Abh4y";

        // Act
        boolean result = UsernameValidator.isValidUsername(validUsername);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testInvalidUsernames() {
        // Arrange
        String invalidUsername = "123user";

        // Act
        boolean result = UsernameValidator.isValidUsername(invalidUsername);

        // Assert
        assertFalse(result);
    }
}
