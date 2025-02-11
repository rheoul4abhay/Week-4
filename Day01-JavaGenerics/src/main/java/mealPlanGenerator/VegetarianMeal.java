package mealPlanGenerator;

public class VegetarianMeal implements MealPlan{
    @Override
    public void displayMealDetails(){
        System.out.println("Vegetarian Meal Plan: Includes plant-based foods, no meat.");
    }
}
