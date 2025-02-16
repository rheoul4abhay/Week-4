package RegexTests.BasicProblemsTests;

import Regex.BasicProblems.ValidateLicensePlateNumber.LicensePlateValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LicensePlateValidatorTest {

    @Test
    public void testValidLicensePlates() {
        // Arrange
        String validPlate = "IN1234";

        // Act
        boolean result = LicensePlateValidator.validLicensePlate(validPlate);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testInvalidLicensePlates() {
        // Arrange
        String invalidPlate = "INDIA1234";

        // Act
        boolean result = LicensePlateValidator.validLicensePlate(invalidPlate);

        // Assert
        assertFalse(result);
    }
}
