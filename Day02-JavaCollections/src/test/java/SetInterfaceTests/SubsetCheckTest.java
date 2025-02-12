package SetInterfaceTests;

import SetInterface.findSubsets.SubsetCheck;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SubsetCheckTest {

    @Test
    void testSubsetTrue() {
        // Arrange
        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Act & Assert
        assertTrue(SubsetCheck.checkSubset(subset, superset), "Subset should return true as all elements of subset exist in the superset.");
    }

    @Test
    void testSubsetFalse() {
        // Arrange
        Set<String> subset = new HashSet<>(Arrays.asList("Abhay", "Rose"));
        Set<String> superset = new HashSet<>(Arrays.asList("Mary", "Abhay", "Rin"));

        // Act & Assert
        assertFalse(SubsetCheck.checkSubset(subset, superset), "Subset should return false as 'Rose' is not in the superset.");
    }

    @Test
    void testEmptySubset() {
        // Arrange
        Set<Integer> subset = new HashSet<>();
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Act & Assert
        assertTrue(SubsetCheck.checkSubset(subset, superset), "An empty set should always be a subset of any set.");
    }

    @Test
    void testSubsetEqualSets() {
        // Arrange
        Set<Integer> subset = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3));

        // Act & Assert
        assertTrue(SubsetCheck.checkSubset(subset, superset), "If both sets are identical, the subset check should return true.");
    }
}
