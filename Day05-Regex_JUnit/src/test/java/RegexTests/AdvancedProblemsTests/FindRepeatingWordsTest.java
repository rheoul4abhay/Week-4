package RegexTests.AdvancedProblemsTests;

import Regex.AdvancedProblems.FindRepeatingWords.FindRepeatingWords;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FindRepeatingWordsTest {

    @Test
    public void testFindRepeatingWords() {
        // Arrange
        String text = "This is is a repeated repeated word test";

        // Act
        List<String> repeatingWords = FindRepeatingWords.findRepeatingWords(text);

        // Assert
        assertEquals(List.of("is", "repeated"), repeatingWords);
    }
}

