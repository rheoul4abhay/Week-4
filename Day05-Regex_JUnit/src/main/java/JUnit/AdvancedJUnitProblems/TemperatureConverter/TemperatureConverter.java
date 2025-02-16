package JUnit.AdvancedJUnitProblems.TemperatureConverter;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = 72;

        System.out.println(celsius + " degrees celsius = " + celsiusToFahrenheit(celsius) + " degrees fahrenheit");
        System.out.println(celsius + " degrees fahrenheit = " + fahrenheitToCelsius(fahrenheit) + " degrees celsius");
    }
}
