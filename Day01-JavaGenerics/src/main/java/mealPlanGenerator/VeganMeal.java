package mealPlanGenerator;

public class VeganMeal implements MealPlan{
    @Override
    public void displayMealDetails(){
        System.out.println("Vegan Meal Plan: Includes only plant-based foods, no animal products.");
    }
}
