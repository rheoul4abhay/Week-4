package RegexTests.AdvancedProblemsTests;

import Regex.AdvancedProblems.ValidateCreditCardNumber.ValidateCreditCard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateCreditCardTest {

    @Test
    public void testValidCreditCards() {
        // Arrange
        String validVisa = "4111111111111111";
        String validMaster = "5500000000000004";

        // Act & Assert
        assertTrue(ValidateCreditCard.isValidCreditCard(validVisa));
        assertTrue(ValidateCreditCard.isValidCreditCard(validMaster));
    }

    @Test
    public void testInvalidCreditCards() {
        // Arrange
        String invalidCard = "1234567890123456";

        // Act & Assert
        assertFalse(ValidateCreditCard.isValidCreditCard(invalidCard));
    }
}
