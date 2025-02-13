package MapInterface.wordFrequencyCounter;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyTest {

    @Test
    void testEmptyString() {
        // Arrange
        String input = "";

        // Act
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(input);

        // Assert
        assertTrue(result.isEmpty(), "Word frequency map for empty string should be empty");
    }

    @Test
    void testSingleWord() {
        // Arrange
        String input = "Hello";

        // Act
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(input);

        // Assert
        assertEquals(1, result.get("hello"), "Frequency of 'hello' should be 1");
        assertEquals(1, result.size(), "Word frequency map should contain only one entry");
    }

    @Test
    void testMultipleWordsWithPunctuation() {
        // Arrange
        String input = "Hello world, hello Java!";

        // Act
        String processedInput = input.replaceAll("[^a-zA-Z0-9]", " ");
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(processedInput);

        // Assert
        assertEquals(2, result.get("hello"), "Frequency of 'hello' should be 2");
        assertEquals(1, result.get("world"), "Frequency of 'world' should be 1");
        assertEquals(1, result.get("java"), "Frequency of 'java' should be 1");
    }

    @Test
    void testCaseInsensitivity() {
        // Arrange
        String input = "HELLO hello HeLLo";

        // Act
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(input.toLowerCase());

        // Assert
        assertEquals(3, result.get("hello"), "Frequency of 'hello' should be 3 regardless of case");
        assertEquals(1, result.size(), "Word frequency map should contain only one entry for 'hello'");
    }

    @Test
    void testTextWithNumbers() {
        // Arrange
        String input = "Java 101, Java 102!";

        // Act
        String processedInput = input.replaceAll("[^a-zA-Z0-9]", " ");
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(processedInput);

        // Assert
        assertEquals(2, result.get("java"), "Frequency of 'java' should be 2");
        assertEquals(1, result.get("101"), "Frequency of '101' should be 1");
        assertEquals(1, result.get("102"), "Frequency of '102' should be 1");
    }

    @Test
    void testComplexSentence() {
        // Arrange
        String input = "A quick brown fox jumps over the lazy dog. A quick, brown dog!";

        // Act
        String processedInput = input.replaceAll("[^a-zA-Z0-9]", " ");
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(processedInput);

        // Assert
        assertEquals(2, result.get("a"), "Frequency of 'a' should be 2");
        assertEquals(2, result.get("quick"), "Frequency of 'quick' should be 2");
        assertEquals(2, result.get("brown"), "Frequency of 'brown' should be 2");
        assertEquals(1, result.get("fox"), "Frequency of 'fox' should be 1");
        assertEquals(2, result.get("dog"), "Frequency of 'dog' should be 2");
    }
}
