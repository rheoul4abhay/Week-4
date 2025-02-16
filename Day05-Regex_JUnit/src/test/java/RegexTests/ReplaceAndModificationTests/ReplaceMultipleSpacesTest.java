package RegexTests.ReplaceAndModificationTests;

import Regex.ReplaceAndModifyStrings.ReplaceMultipleSpaceWithSingleSpace.ReplaceMultipleSpaces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceMultipleSpacesTest {

    @Test
    public void testReplaceMultipleSpaces() {
        // Arrange
        String text = "This    is  an  example  with   multiple spaces   . ";

        // Act
        String result = ReplaceMultipleSpaces.replaceMultipleSpaces(text);

        // Assert
        assertEquals("This is an example with multiple spaces .", result);
    }
}
