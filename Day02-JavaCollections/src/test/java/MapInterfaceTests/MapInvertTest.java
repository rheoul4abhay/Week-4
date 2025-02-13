package MapInterfaceTests;

import MapInterface.invertMap.MapInvert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.List;

public class MapInvertTest {

    @Test
    public void testInvertMap() {
        // Test case with multiple keys having the same value
        Map<String, Integer> originalMap = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> expectedInvertedMap = Map.of(1, List.of("A", "C"), 2, List.of("B"));
        Map<Integer, List<String>> actualInvertedMap = MapInvert.invertMap(originalMap);
        assertEquals(expectedInvertedMap, actualInvertedMap, "The inverted map should match the expected result.");
    }

    @Test
    public void testInvertMapWithSingleEntry() {
        // Test case with a single entry in the map
        Map<String, Integer> originalMap = Map.of("A", 1);
        Map<Integer, List<String>> expectedInvertedMap = Map.of(1, List.of("A"));
        Map<Integer, List<String>> actualInvertedMap = MapInvert.invertMap(originalMap);
        assertEquals(expectedInvertedMap, actualInvertedMap, "The inverted map should have only one entry.");
    }

    @Test
    public void testInvertMapWithEmptyMap() {
        // Test case with an empty map
        Map<String, Integer> originalMap = Map.of();
        Map<Integer, List<String>> expectedInvertedMap = Map.of();
        Map<Integer, List<String>> actualInvertedMap = MapInvert.invertMap(originalMap);
        assertEquals(expectedInvertedMap, actualInvertedMap, "The inverted map should be empty.");
    }

    @Test
    public void testInvertMapWithUniqueValues() {
        // Test case where all values are unique
        Map<String, Integer> originalMap = Map.of("A", 1, "B", 2, "C", 3);
        Map<Integer, List<String>> expectedInvertedMap = Map.of(1, List.of("A"), 2, List.of("B"), 3, List.of("C"));
        Map<Integer, List<String>> actualInvertedMap = MapInvert.invertMap(originalMap);
        assertEquals(expectedInvertedMap, actualInvertedMap, "The inverted map should correctly reflect unique values.");
    }
}
