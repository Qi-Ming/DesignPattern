package ProtoTypePattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape > shapeMap = new Hashtable<>();

    public static Shape getShape (String id) {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();
    }

    public static void loadShapeCache() {
        Circle circle = new Circle();
        circle.setID(1);
        shapeMap.put(String.valueOf(circle.getID()), circle);

        Triangle triangle = new Triangle();
        triangle.setID(2);
        shapeMap.put(String.valueOf(triangle.getID()), triangle);

        Rectangle rectangle = new Rectangle();
        rectangle.setID(3);
        shapeMap.put(String.valueOf(rectangle.getID()), rectangle);
    }
}
