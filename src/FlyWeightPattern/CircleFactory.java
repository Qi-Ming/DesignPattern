package FlyWeightPattern;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap<String, Circle> circleHashMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleHashMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleHashMap.put(color, circle);
            System.out.println("create circle of" + color);
        }
        return circle;
    }
}
