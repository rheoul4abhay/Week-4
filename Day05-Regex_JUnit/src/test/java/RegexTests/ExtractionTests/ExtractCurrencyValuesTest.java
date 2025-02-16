package RegexTests.ExtractionTests;

import Regex.AdvancedProblems.ExtractCurrencyValues.ExtractCurrencyValues;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractCurrencyValuesTest {

    @Test
    public void testExtractCurrencyValues() {
        // Arrange
        String text = "The price is $45.99, the discount is 10.50, and the total is €1,200 or ₹500.";

        // Act
        List<String> values = ExtractCurrencyValues.extractCurrencyValues(text);

        // Assert
        assertEquals(List.of("$45.99", "10.50", "€1,200", "₹500"), values);
    }
}
