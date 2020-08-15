package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "Circle" :
                return new Circle();
            case "Rentangle":
                return new Rentangle();
            case "Triangle":
                return new Triangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
