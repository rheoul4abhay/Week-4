package RegexTests.AdvancedProblemsTests;

import Regex.AdvancedProblems.ValidateSocialSecurityNumber.ValidateSSN;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateSSNTest {

    @Test
    public void testValidSSNs() {
        // Arrange
        String validSSN = "123-45-6789";

        // Act & Assert
        assertTrue(ValidateSSN.isValidSSN(validSSN));
    }

    @Test
    public void testInvalidSSNs() {
        // Arrange
        String invalidSSN = "123456789";

        // Act & Assert
        assertFalse(ValidateSSN.isValidSSN(invalidSSN));
    }
}

