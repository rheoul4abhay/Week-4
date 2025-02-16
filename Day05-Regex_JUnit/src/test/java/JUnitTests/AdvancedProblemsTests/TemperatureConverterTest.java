package JUnitTests.AdvancedProblemsTests;

import JUnit.AdvancedJUnitProblems.TemperatureConverter.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        // Arrange
        double celsius = 25.0;

        // Act
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(77.0, fahrenheit, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Arrange
        double fahrenheit = 98.6;

        // Act
        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(37.0, celsius, 0.001);
    }
}
