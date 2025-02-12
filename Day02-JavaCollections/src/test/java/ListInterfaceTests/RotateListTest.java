package ListInterfaceTests;
import ListInterface.ReverseList.ReverseList;
import ListInterface.RotateElements.RotateElements;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RotateListTest {

    @Test
    void emptyListTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{}));
        int n = 2;

        //Act
        List<Integer> rotatedList = RotateElements.rotateList(list, n);

        //Assert
        assertEquals(list, rotatedList, "Result must be an empty list");
    }

    @Test
    void rotatedIntegerListTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        int n = 12; //to test positions that are more than the size of the list

        //Act
        List<Integer> rotatedList = RotateElements.rotateList(list, n);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(new Integer[]{3, 4, 5, 1, 2}));

        //Assert
        assertEquals(expectedList, rotatedList, "Rotated list is not equal to expected result");
    }

    @Test
    void rotatedStringListTest(){
        //Arrange
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"Abhay", "Sam", "Rohit", "Jake", "Bill"}));
        int n = 3;

        //Act
        List<String> rotatedList = RotateElements.rotateList(list, n);
        List<String> expectedList = new ArrayList<>(Arrays.asList(new String[]{"Jake", "Bill", "Abhay", "Sam", "Rohit"}));

        //Assert
        assertEquals(expectedList, rotatedList, "Rotated list is not equal to expected result");
    }

    @Test
    void reverseMethodTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));

        //Act
        RotateElements.reverseList(list, 0, list.size()-1);

        //Assert
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(new Integer[]{5, 4, 3, 2, 1}));
        assertEquals(expectedList, list, "Arrays are not equal");
    }
}
