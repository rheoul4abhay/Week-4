package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(5, 3);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.subtract(10, 4);

        // Assert
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.multiply(6, 7);

        // Assert
        assertEquals(42, result);
    }

    @Test
    public void testDivision() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.divide(20, 5);

        // Assert
        assertEquals(4, result);
    }

    @Test
    public void testDivisionByZero() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}

