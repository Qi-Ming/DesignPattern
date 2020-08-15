package BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle greenCircle = new Circle(10,10, 1, new GreenCircle());
        Circle redCircle = new Circle(0,0, 1, new RedCircle());
        greenCircle.draw();
        redCircle.draw();
    }
}
