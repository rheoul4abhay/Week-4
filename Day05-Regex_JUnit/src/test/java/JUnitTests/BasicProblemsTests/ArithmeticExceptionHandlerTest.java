package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.ArithmeticExceptionHandling.ArithmeticExceptionHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticExceptionHandlerTest {

    @Test
    public void testValidDivision() {
        // Arrange & Act
        int result = ArithmeticExceptionHandler.divide(10, 2);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testDivisionByZero() {
        // Act & Assert
        assertThrows(ArithmeticException.class, () -> ArithmeticExceptionHandler.divide(10, 0));
    }
}
