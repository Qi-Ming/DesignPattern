package DecoratorPattern;

public class Rectangle implements Shape {
    @Override
    public void Draw() {
        System.out.println("Rectangle");
    }
}