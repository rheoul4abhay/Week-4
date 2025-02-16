package RegexTests.ExtractionTests;

import Regex.ExtractionProblems.ExtractEmailAddressesFromText.ExtractEmailAddresses;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractEmailAddressesTest {

    @Test
    public void testExtractEmails() {
        // Arrange
        String text = "Contact us at support@example.com and info@company.org";

        // Act
        List<String> emails = ExtractEmailAddresses.extractEmails(text);

        // Assert
        assertEquals(List.of("support@example.com", "info@company.org"), emails);
    }
}

