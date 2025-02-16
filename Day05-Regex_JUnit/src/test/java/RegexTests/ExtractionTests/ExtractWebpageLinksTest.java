package RegexTests.ExtractionTests;

import Regex.ExtractionProblems.ExtractWebpageLinks.ExtractWebpageLinks;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractWebpageLinksTest {

    @Test
    public void testExtractLinks() {
        // Arrange
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Act
        List<String> links = ExtractWebpageLinks.extractLinks(text);

        // Assert
        assertEquals(List.of("https://www.google.com", "http://example.org"), links);
    }
}
