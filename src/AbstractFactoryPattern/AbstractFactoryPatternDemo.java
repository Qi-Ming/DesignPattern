package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        ColorFactory colorFactory = (ColorFactory) FactoryProducer.getFactory("Color");
        ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory("Shape");
        Shape circle =  shapeFactory.getShape("Circle");
        Shape rentangle = shapeFactory.getShape("Rentangle");
        Shape triangle = shapeFactory.getShape("Triangle");
        Color green = colorFactory.getColor("Green");
        Color blue = colorFactory.getColor("Blue");
        Color yellow = colorFactory.getColor("Yellow");
        circle.Draw();
        rentangle.Draw();
        triangle.Draw();
        green.fill();
        blue.fill();
        yellow.fill();
    }
}
