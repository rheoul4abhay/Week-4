package QueueInterfaceTests;

import QueueInterface.generateBinaryUsingQueue.GenerateBinaryNumberUsingQueue;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateBinaryNumberUsingQueueTest {

    @Test
    void testGenerateBinaryNumbersPositiveN() {
        // Arrange
        int n = 5;
        List<String> expected = List.of("1", "10", "11", "100", "101");

        // Act
        List<String> result = GenerateBinaryNumberUsingQueue.generateBinaryNumbers(n);

        // Assert
        assertEquals(expected, result, "The generated binary numbers should match the expected list.");
    }

    @Test
    void testGenerateBinaryNumbersZero() {
        // Arrange
        int n = 0;

        // Act
        List<String> result = GenerateBinaryNumberUsingQueue.generateBinaryNumbers(n);

        // Assert
        assertTrue(result.isEmpty(), "Generating binary numbers for n=0 should return an empty list.");
    }

    @Test
    void testGenerateBinaryNumbersNegativeN() {
        // Arrange
        int n = -3;

        // Act
        List<String> result = GenerateBinaryNumberUsingQueue.generateBinaryNumbers(n);

        // Assert
        assertTrue(result.isEmpty(), "Generating binary numbers for negative n should return an empty list.");
    }

    @Test
    void testGenerateBinaryNumbersLargeN() {
        // Arrange
        int n = 10;
        List<String> expected = List.of("1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010");

        // Act
        List<String> result = GenerateBinaryNumberUsingQueue.generateBinaryNumbers(n);

        // Assert
        assertEquals(expected, result, "The generated binary numbers for n=10 should match the expected list.");
    }
}
