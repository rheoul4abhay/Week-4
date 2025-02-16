package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.StringUtils.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        // Arrange
        String input = "hello";

        // Act
        String result = StringUtils.reverse(input);

        // Assert
        assertEquals("olleh", result);
    }

    @Test
    public void testIsPalindromeTrue() {
        // Arrange
        String input = "Madam";

        // Act
        boolean result = StringUtils.isPalindrome(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPalindromeFalse() {
        // Arrange
        String input = "Hello";

        // Act
        boolean result = StringUtils.isPalindrome(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testToUpperCase() {
        // Arrange
        String input = "hello";

        // Act
        String result = StringUtils.toUpperCase(input);

        // Assert
        assertEquals("HELLO", result);
    }
}

