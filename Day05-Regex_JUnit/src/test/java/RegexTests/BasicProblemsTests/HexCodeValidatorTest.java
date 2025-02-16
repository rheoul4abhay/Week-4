package RegexTests.BasicProblemsTests;

import Regex.BasicProblems.ValidateHexColorCode.HexCodeValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexCodeValidatorTest {

    @Test
    public void testValidHexCodes() {
        // Arrange
        String validHex = "#FFA500";

        // Act
        boolean result = HexCodeValidator.isValidHex(validHex);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testInvalidHexCodes() {
        // Arrange
        String invalidHex = "FFF000";

        // Act
        boolean result = HexCodeValidator.isValidHex(invalidHex);

        // Assert
        assertFalse(result);
    }
}
