package SetInterfaceTests;

import SetInterface.symmetricDifference.SetSymmetricDifference;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetSymmetricDifferenceTest {

    @Test
    void testSymmetricDifference() {
        // Arrange
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Act
        Set<Integer> result = SetSymmetricDifference.symmetricDifference(set1, set2);

        // Assert
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expected, result, "The symmetric difference should include elements in either set but not both.");
    }

    @Test
    void testSymmetricDifferenceEmptySet() {
        // Arrange
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Act
        Set<Integer> result = SetSymmetricDifference.symmetricDifference(set1, set2);

        // Assert
        assertEquals(set2, result, "The symmetric difference of an empty set and a non-empty set should be the non-empty set.");
    }

    @Test
    void testSymmetricDifferenceSameSets() {
        // Arrange
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Act
        Set<Integer> result = SetSymmetricDifference.symmetricDifference(set1, set2);

        // Assert
        assertTrue(result.isEmpty(), "The symmetric difference of identical sets should be empty.");
    }
}
