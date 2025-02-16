package RegexTests.AdvancedProblemsTests;


import Regex.AdvancedProblems.ValidateIP_Address.ValidateIP_Address;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateIPAddressTest {

    @Test
    public void testValidIPAddresses() {
        // Arrange
        String validIP = "192.168.1.1";

        // Act & Assert
        assertTrue(ValidateIP_Address.isValidIPv4(validIP));
    }

    @Test
    public void testInvalidIPAddresses() {
        // Arrange
        String invalidIP = "256.100.50.25";

        // Act & Assert
        assertFalse(ValidateIP_Address.isValidIPv4(invalidIP));
    }
}

