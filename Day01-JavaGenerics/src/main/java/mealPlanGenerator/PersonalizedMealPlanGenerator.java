package mealPlanGenerator;

//generic method to generate meal plans dynamically
public class PersonalizedMealPlanGenerator {

    public static <T extends MealPlan> Meal<T> createMealPlan(T mealPlan){
        Meal<T> meal = new Meal<>(mealPlan);
        if(meal.validateMealPlan()) {
            meal.generateMealPlan();
        } else {
            System.out.println("Invalid meal plan");
        }
        return meal;
    }
}
