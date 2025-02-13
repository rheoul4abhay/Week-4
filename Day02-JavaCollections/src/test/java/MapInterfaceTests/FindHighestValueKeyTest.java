package MapInterfaceTests;

import MapInterface.findKeyWithHighestValue.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class FindHighestValueKeyTest {

    @Test
    public void testFindMaxKey() {
        // Sample test case with positive values
        Map<String, Integer> input = Map.of("A", 10, "B", 20, "C", 15);
        String result = FindHighestValueKey.findMaxKey(input);
        assertEquals("B", result, "The key with the highest value should be 'B'");
    }

    @Test
    public void testFindMaxKeyWithNegativeValues() {
        // Test case with negative values
        Map<String, Integer> input = Map.of("A", -10, "B", -20, "C", -15);
        String result = FindHighestValueKey.findMaxKey(input);
        assertEquals("A", result, "The key with the highest value should be 'A' in case of negative values");
    }

    @Test
    public void testFindMaxKeyWithSingleEntry() {
        // Test case with a single entry in the map
        Map<String, Integer> input = Map.of("A", 10);
        String result = FindHighestValueKey.findMaxKey(input);
        assertEquals("A", result, "The key with the highest value should be 'A'");
    }

    @Test
    public void testFindMaxKeyWithEmptyMap() {
        // Test case with an empty map
        Map<String, Integer> input = Map.of();
        String result = FindHighestValueKey.findMaxKey(input);
        assertNull(result, "The result should be null for an empty map");
    }
}
