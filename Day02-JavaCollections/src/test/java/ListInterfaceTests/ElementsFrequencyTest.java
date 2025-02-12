package ListInterfaceTests;
import ListInterface.ElementsFrequency.FindElementFrequency;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ElementsFrequencyTest {

    @Test
    void mapFrequencyTest(){
        //Arrange
        List<String> names = new ArrayList<>(Arrays.asList(new String[]{"Abhay", "Ram", "Bhuvan", "Ashish", "Abhay", "Bhuvan"}));

        //Act
        Map<String, Integer> frequencyMap = FindElementFrequency.countFrequency(names);

        //Assert
        assertEquals(2, frequencyMap.get("Abhay"), "Frequency of Abhay in map should be 2");
        //Testing the frequency of some element which is not present in the map
        assertEquals(null, frequencyMap.get("Abhinav"), "Frequency of Abhinav in map should be 0");
    }

    @Test
    void emptyListTest(){
        //Arrange
        List<String> names = new ArrayList<>(Arrays.asList(new String[] {}));

        //Act
        Map<String, Integer> frequencyMap = FindElementFrequency.countFrequency(names);

        //Assert
        assertEquals(0, frequencyMap.size(), "Size of map must be 0");
        assertEquals(null, frequencyMap.get("Ram"), "List is empty so no key exists with this name");
    }
}
