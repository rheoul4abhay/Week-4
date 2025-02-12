package SetInterfaceTests;

import SetInterface.setsEqualityCheck.CheckSetsEquality;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetEqualityTest {

    @Test
    void testSetEquality() {
        // Arrange
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 3, 1, 5));

        // Act & Assert
        assertTrue(CheckSetsEquality.checkSetEquality(set1, set2), "Sets should be equal as they contain the same elements.");
    }

    @Test
    void testSetInequality() {
        // Arrange
        Set<String> set1 = new HashSet<>(Arrays.asList("Abhay", "Amilia"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Amilia", "Abhay", "John"));

        // Act & Assert
        assertFalse(CheckSetsEquality.checkSetEquality(set1, set2), "Sets should not be equal as set2 contains an extra element.");
    }

    @Test
    void testSetEqualityWithDuplicates() {
        // Arrange
        Set<String> set1 = new HashSet<>(Arrays.asList("Abhay", "Amilia", "Abhay", "Amilia"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Amilia", "Abhay"));

        // Act & Assert
        assertTrue(CheckSetsEquality.checkSetEquality(set1, set2), "Sets should be equal as duplicates are not considered in sets.");
    }

    @Test
    void testSetEqualityWithEmptySets() {
        // Arrange
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Act & Assert
        assertTrue(CheckSetsEquality.checkSetEquality(set1, set2), "Two empty sets should be considered equal.");
    }
}
