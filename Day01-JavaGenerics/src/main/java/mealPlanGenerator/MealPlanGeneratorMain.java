package mealPlanGenerator;

public class MealPlanGeneratorMain {
    public static void main(String[] args) {
        VegetarianMeal vegetarian = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        HighProtein highProtein = new HighProtein();
        Keto keto = new Keto();

        System.out.println("Generated vegetarian meal plan: ");
        PersonalizedMealPlanGenerator.createMealPlan(vegetarian);

        System.out.println("Genrated vegan meal plan: ");
        PersonalizedMealPlanGenerator.createMealPlan(vegan);

        System.out.println("Generated keto meal plan: ");
        PersonalizedMealPlanGenerator.createMealPlan(keto);

        System.out.println("Generated high protein meal plan: ");
        PersonalizedMealPlanGenerator.createMealPlan(highProtein);
    }
}
