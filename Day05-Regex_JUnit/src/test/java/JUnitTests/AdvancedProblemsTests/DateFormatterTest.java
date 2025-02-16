package JUnitTests.AdvancedProblemsTests;

import JUnit.AdvancedJUnitProblems.DateFormatter.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    @Test
    public void testValidDateFormat() {
        // Arrange
        String inputDate = "2024-02-17";

        // Act
        String formattedDate = DateFormatter.formatDate(inputDate);

        // Assert
        assertEquals("17-02-2024", formattedDate);
    }

    @Test
    public void testInvalidDateFormat() {
        // Arrange
        String inputDate = "17-02-2024";

        // Act
        String formattedDate = DateFormatter.formatDate(inputDate);

        // Assert
        assertEquals("Invalid date", formattedDate);
    }

    @Test
    public void testNullInput() {
        // Act
        String formattedDate = DateFormatter.formatDate(null);

        // Assert
        assertEquals("Invalid date", formattedDate);
    }
}
