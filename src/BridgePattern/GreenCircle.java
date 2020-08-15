package BridgePattern;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("DrawCircle [color : green " + x +" " + y +" " + radius + "]");
    }
}
