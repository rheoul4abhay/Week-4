package MapInterfaceTests;

import MapInterface.mergeTwoMaps.MergeTwoMaps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class MergeTwoMapsTest {

    @Test
    public void testMergeMapsWithCommonKeys() {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        Map<String, Integer> expectedMergedMap = Map.of("A", 1, "B", 5, "C", 4);
        Map<String, Integer> actualMergedMap = MergeTwoMaps.mergeMaps(map1, map2);
        assertEquals(expectedMergedMap, actualMergedMap, "The merged map should sum values of common keys.");
    }

    @Test
    public void testMergeMapsWithNoCommonKeys() {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("C", 3, "D", 4);
        Map<String, Integer> expectedMergedMap = Map.of("A", 1, "B", 2, "C", 3, "D", 4);
        Map<String, Integer> actualMergedMap = MergeTwoMaps.mergeMaps(map1, map2);
        assertEquals(expectedMergedMap, actualMergedMap, "The merged map should contain all keys from both maps.");
    }

    @Test
    public void testMergeMapsWithEmptyMaps() {
        Map<String, Integer> map1 = Map.of();
        Map<String, Integer> map2 = Map.of();
        Map<String, Integer> expectedMergedMap = Map.of();
        Map<String, Integer> actualMergedMap = MergeTwoMaps.mergeMaps(map1, map2);
        assertEquals(expectedMergedMap, actualMergedMap, "The merged map should be empty when both maps are empty.");
    }

    @Test
    public void testMergeMapsWithOneEmptyMap() {
        Map<String, Integer> map1 = Map.of("A", 1);
        Map<String, Integer> map2 = Map.of();
        Map<String, Integer> expectedMergedMap = Map.of("A", 1);
        Map<String, Integer> actualMergedMap = MergeTwoMaps.mergeMaps(map1, map2);
        assertEquals(expectedMergedMap, actualMergedMap, "The merged map should be the same as map1 when map2 is empty.");
    }
}

