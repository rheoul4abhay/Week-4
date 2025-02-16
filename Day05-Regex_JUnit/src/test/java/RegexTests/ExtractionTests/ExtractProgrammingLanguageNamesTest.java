package RegexTests.ExtractionTests;

import Regex.AdvancedProblems.ExtractProgrammingLanguagesNames.ExtractProgrammingLanguageNames;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractProgrammingLanguageNamesTest {

    @Test
    public void testExtractLanguages() {
        // Arrange
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Act
        List<String> languages = ExtractProgrammingLanguageNames.extractLanguages(text);

        // Assert
        assertEquals(List.of("Java", "Python", "JavaScript", "Go"), languages);
    }
}


