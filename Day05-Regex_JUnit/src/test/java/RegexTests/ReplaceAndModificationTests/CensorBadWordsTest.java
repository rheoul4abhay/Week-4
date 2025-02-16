package RegexTests.ReplaceAndModificationTests;

import Regex.ReplaceAndModifyStrings.CensorBadWordsInSentence.CensorBadWords;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CensorBadWordsTest {

    @Test
    public void testCensorBadWords() {
        // Arrange
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};

        // Act
        String result = CensorBadWords.censorText(text, badWords);

        // Assert
        assertEquals("This is a **** bad example with some ****** words.", result);
    }
}
