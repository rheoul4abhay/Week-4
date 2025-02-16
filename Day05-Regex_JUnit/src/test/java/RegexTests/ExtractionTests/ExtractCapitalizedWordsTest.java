package RegexTests.ExtractionTests;

import Regex.ExtractionProblems.ExtractCapitalizedWordsInSentence.ExtractCapitalizedWords;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractCapitalizedWordsTest {

    @Test
    public void testExtractCapitalizedWords() {
        // Arrange
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Act
        List<String> words = ExtractCapitalizedWords.extractWords(text);

        // Assert
        assertEquals(List.of("The", "Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"), words);
    }
}
