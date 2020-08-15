package FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getInstance("Circle");
        Shape rentangle = factory.getInstance("Rentangle");
        Shape triangle = factory.getInstance("Triangle");
        circle.Draw();
        rentangle.Draw();
        triangle.Draw();
    }
}
