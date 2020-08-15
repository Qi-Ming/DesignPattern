package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color.equals("Green")) {
            return new Green();
        } else if (color.equals("Blue")) {
            return new Blue();
        } else if (color.equals("Yellow")) {
            return new Yellow();
        }
        return null;
    }
}
