package FlyWeightPattern;

public class FlyWeightPatternDemo {
    private static final String [] color = {"red", "green", "blue", "black", "yellow"};
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return color[(int) (Math.random() * color.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random()*100);
    }

    private static int getRandomY() {
        return (int) (Math.random()*100);
    }
}
