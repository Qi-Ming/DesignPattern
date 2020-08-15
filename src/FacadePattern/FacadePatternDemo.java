package FacadePattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        FacadeMaker facadeMaker = new FacadeMaker();
        facadeMaker.drawCircle();;
        facadeMaker.drawRectangle();
        facadeMaker.drawTriangle();
    }
}
