package ListInterfaceTests;
import ListInterface.RemoveDuplicates.RemoveDuplicatesPreservingOrder;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    void emptyListTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{}));

        //Act
        List<Integer> newList = RemoveDuplicatesPreservingOrder.removeDuplicates(list);

        //Assert
        assertEquals(list , newList, "Result must be an empty list");
    }

    @Test
    void removeDuplicatesTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 2, 4, 5, 1, 6, 6, 20, 1}));

        //Act
        List<Integer> newList = RemoveDuplicatesPreservingOrder.removeDuplicates(list);

        //Assert
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 4, 5, 6, 20}));
        assertEquals(expectedList, newList, "Array does not contains unique elements");
    }

    @Test
    void elementsInPlaceTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 2, 4, 5, 1, 6, 6, 20, 1}));

        //Act
        List<Integer> newList = RemoveDuplicatesPreservingOrder.removeDuplicates(list);

        //Assert
        List<Integer> wrongOrderList = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 4, 6, 5, 20}));
        assertFalse(newList.equals(wrongOrderList), "Both array are equal, expected array is not in place");
    }
}
