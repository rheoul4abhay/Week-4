package ListInterfaceTests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import ListInterface.ReverseList.*;



public class ReverseListTest {
    @Test
    void emptyArrayListTest(){
        //Arrange
        List<Integer> list = new ArrayList<>();

        //Act
        List<Integer> reversedList = ReverseList.reverseList(list);

        //Assert
        assertArrayEquals(new Integer[0] , reversedList.toArray(), "Arrays are not equal!");
    }

    @Test
    void emptyLinkedListTest(){
        //Arrange
        List<Integer> list = new LinkedList<>();

        //Act
        List<Integer> reversedList = ReverseList.reverseList(list);

        //Assert
        assertArrayEquals(new Integer[0] , reversedList.toArray(), "Arrays are not equal");
    }

    @Test
    void arrayListReverseTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));

        //Act
        List<Integer> reversedList = ReverseList.reverseList(list);

        //Assert
        assertArrayEquals(new Integer[]{5, 4, 3, 2, 1}, reversedList.toArray(), "Arrays are not equal");
    }

    @Test
    void linkedListReverseTest(){
        //Arrange
        List<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));

        //Act
        List<Integer> reversedList = ReverseList.reverseList(list);

        //Assert
        assertArrayEquals(new Integer[]{5, 4, 3, 2, 1}, reversedList.toArray(), "Arrays are not equal");
    }

    @Test
    void arrayListReverseTest_NotEquals(){
        //Arrange
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"Abhay", "Sam", "Rohit"}));
        List<String> originalListCopy = new ArrayList<>(list); // To Make a defensive copy

        //Act
        List<String> reversedList = ReverseList.reverseList(list);

        //Assert
        assertNotEquals(reversedList, originalListCopy, "Reversed list should not be equal to the original list");
    }
}
