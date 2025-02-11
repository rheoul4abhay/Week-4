package mealPlanGenerator;

public class Meal<T extends MealPlan>{
    private T mealPlan;

    public Meal(T mealPlan){
        this.mealPlan = mealPlan;
    }

    public void generateMealPlan(){
        mealPlan.displayMealDetails();
    }

    public boolean validateMealPlan(){
        if(mealPlan instanceof VegetarianMeal || mealPlan instanceof VeganMeal || mealPlan instanceof Keto || mealPlan instanceof HighProtein){
            return true;
        }
        return false;
    }

}
