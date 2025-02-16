package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.EvenNumbers.CheckEvenNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class CheckEvenNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void testEvenNumbers(int number) {
        // Act
        boolean result = CheckEvenNumber.isEven(number);

        // Assert
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    public void testOddNumbers(int number) {
        // Act
        boolean result = CheckEvenNumber.isEven(number);

        // Assert
        assertFalse(result);
    }
}

