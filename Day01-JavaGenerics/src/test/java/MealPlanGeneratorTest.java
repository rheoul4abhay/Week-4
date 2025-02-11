import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import mealPlanGenerator.*;

public class MealPlanGeneratorTest {

    @Test
    void testGenerateVegetarianMealPlan() {
        // Arrange
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        Meal<VegetarianMeal> meal = new Meal<>(vegetarianMeal);

        // Act and Assert: To Ensure the generateMealPlan method works without exceptions
        assertDoesNotThrow(meal::generateMealPlan, "Vegetarian meal plan generation failed.");
    }

    @Test
    public void testValidateVegetarianMealPlan() {
        // Arrange
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        Meal<VegetarianMeal> meal = new Meal<>(vegetarianMeal);

        // Act and Assert: To Ensure validation returns true for a valid vegetarian meal plan
        assertTrue(meal.validateMealPlan(), "Vegetarian meal plan validation failed.");
    }

    @Test
    void testInvalidMealPlan(){
        Meal<MealPlan> invalidMealPlan = new Meal<>(new MealPlan() {
            @Override
            public void displayMealDetails() {
                System.out.println("Invalid meal plan");
            }
        });

        //Act and assert: Ensure validation return false for invalid meal plan
        assertFalse(invalidMealPlan.validateMealPlan(), "Invalid meal plan validation failed.");
    }
}
