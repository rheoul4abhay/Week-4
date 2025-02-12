package ListInterfaceTests;
import org.junit.jupiter.api.*;
import ListInterface.NthElementFromEnd.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthElementFromEndTest {

    @Test
    void emptyListTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{}));
        int n = 2;

        //Act
        Integer result = NthElementFromTheEnd.findNthElementFromEnd(list, n);

        //Assert
        assertEquals(null, result, "Result must be null for empty list");
    }

    @Test
    void invalidPositionTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6}));
        int n = list.size() + 1;

        //Act
        Integer result = NthElementFromTheEnd.findNthElementFromEnd(list, n);

        //Assert
        assertEquals(null, result, "Result must be null for values of n greater than list size");
    }

    @Test
    void validPositionIntegerListTest(){
        //Arrange
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6}));
        int n = list.size();
        List<Integer> listCopy = new ArrayList<>(list);

        //Act
        Integer result = NthElementFromTheEnd.findNthElementFromEnd(list, n);

        //Assert
        assertEquals(listCopy.get(0), result, "Result must be the first element of the list");
    }
    @Test
    void validPositionStringListTest(){
        //Arrange
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"Abhay", "Ram", "Mohan", "Elon", "Bill", "Mark"}));
        int n = 3;
        List<String> listCopy = new ArrayList<>(list);

        //Act
        String result = NthElementFromTheEnd.findNthElementFromEnd(list, n);

        //Assert
        assertEquals(listCopy.get(list.size()-n), result, "Result must be 'Elon'");
    }
}
