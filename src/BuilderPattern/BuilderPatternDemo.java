package BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.packages1().showMeal();
        mealBuilder.packages2().showMeal();
    }
}
