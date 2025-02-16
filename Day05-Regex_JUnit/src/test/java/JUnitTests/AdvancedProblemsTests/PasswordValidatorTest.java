package JUnitTests.AdvancedProblemsTests;

import JUnit.AdvancedJUnitProblems.PasswordStrengthValidator.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        // Arrange
        String password = "StrongPass1";

        // Act
        boolean result = PasswordValidator.isValidPassword(password);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testShortPassword() {
        // Arrange
        String password = "Ab1";

        // Act
        boolean result = PasswordValidator.isValidPassword(password);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testNoUppercase() {
        // Arrange
        String password = "secure123";

        // Act
        boolean result = PasswordValidator.isValidPassword(password);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testNoDigit() {
        // Arrange
        String password = "SecurePass";

        // Act
        boolean result = PasswordValidator.isValidPassword(password);

        // Assert
        assertFalse(result);
    }
}
