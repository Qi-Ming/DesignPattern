package BuilderPattern;

public class MealBuilder {
    public Meal packages1() {
        Meal meal = new Meal();
        meal.itemAdd(new Cola());
        meal.itemAdd(new Chicken());
        return meal;
    }

    public Meal packages2() {
        Meal meal = new Meal();
        meal.itemAdd(new Pepsi());
        meal.itemAdd(new Hamburger());
        return meal;
    }
}
