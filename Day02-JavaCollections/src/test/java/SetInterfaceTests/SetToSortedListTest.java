package SetInterfaceTests;

import SetInterface.setToSortedListConversion.ConvertSetToSortedList;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetToSortedListTest {

    @Test
    void testConvertSetToSortedList() {
        // Arrange
        Set<Integer> st = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Act
        List<Integer> sortedList = ConvertSetToSortedList.convertSetToSortedList(st);

        // Assert
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 9);
        assertEquals(expectedList, sortedList, "The set should be converted to a sorted list.");
    }

    @Test
    void testConvertEmptySet() {
        // Arrange
        Set<Integer> st = new HashSet<>();

        // Act
        List<Integer> sortedList = ConvertSetToSortedList.convertSetToSortedList(st);

        // Assert
        assertTrue(sortedList.isEmpty(), "The sorted list of an empty set should also be empty.");
    }
}
