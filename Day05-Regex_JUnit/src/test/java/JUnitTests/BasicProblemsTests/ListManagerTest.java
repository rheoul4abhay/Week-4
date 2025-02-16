package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.ListOperations.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    @Test
    public void testAddElement() {
        // Arrange
        List<Integer> list = new ArrayList<>();

        // Act
        ListManager.addElement(list, 10);

        // Assert
        assertEquals(1, list.size());
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(20);

        // Act
        ListManager.removeElement(list, 20);

        // Assert
        assertEquals(0, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    public void testGetSize() {
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // Act
        int size = ListManager.getSize(list);

        // Assert
        assertEquals(2, size);
    }
}
