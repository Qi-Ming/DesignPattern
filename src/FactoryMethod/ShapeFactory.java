package FactoryMethod;

public class ShapeFactory {
    public Shape getInstance(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Rentangle":
                return new Rentangle();
            case "Triangle":
                return new Triangle();
        }
        return null;
    }
}
