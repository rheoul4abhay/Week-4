package RegexTests.ExtractionTests;

import Regex.ExtractionProblems.ExtractDates.ExtractDates;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractDatesTest {

    @Test
    public void testExtractDates() {
        // Arrange
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Act
        List<String> dates = ExtractDates.extractDates(text);

        // Assert
        assertEquals(List.of("12/05/2023", "15/08/2024", "29/02/2020"), dates);
    }
}
