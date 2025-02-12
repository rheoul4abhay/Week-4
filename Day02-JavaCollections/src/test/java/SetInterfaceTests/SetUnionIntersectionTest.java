package SetInterfaceTests;

import SetInterface.unionIntersection.SetUnionIntersection;
import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetUnionIntersectionTest {

    @Test
    void testFindUnion() {
        // Arrange
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 3, 5, 4, 7));

        // Act
        Set<Integer> actualUnion = SetUnionIntersection.findUnion(set1, set2);

        // Assert
        Set<Integer> expectedUnion = new HashSet<>(Arrays.asList(1, 3, 5, 6, 4, 7));
        assertEquals(expectedUnion, actualUnion, "Union should be correct.");
    }

    @Test
    void testFindIntersection() {
        // Arrange
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 3, 5, 4, 7));

        // Act
        Set<Integer> actualIntersection = SetUnionIntersection.findIntersection(set1, set2);

        // Assert
        Set<Integer> expectedIntersection = new HashSet<>(Arrays.asList(1, 3, 5));
        assertEquals(expectedIntersection, actualIntersection, "Intersection should be correct.");
    }

    @Test
    void testFindUnionEmptySet() {
        // Arrange
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Act & Assert
        assertEquals(set2, SetUnionIntersection.findUnion(set1, set2), "Union of empty and non-empty set should be the non-empty set.");
    }

    @Test
    void testFindIntersectionEmptySet() {
        // Arrange
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Act & Assert
        assertTrue(SetUnionIntersection.findIntersection(set1, set2).isEmpty(), "Intersection of empty set and any set should be empty.");
    }
}
