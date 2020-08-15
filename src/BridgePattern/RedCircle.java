package BridgePattern;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("DrawCircle [color : red " + x +" " + y + " " + radius + "]");
    }
}
