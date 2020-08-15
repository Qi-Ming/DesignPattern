package FacadePattern;

public class FacadeMaker {
    private Circle circle;
    private Rectangle rectangle;
    private Triangle triangle;

    public FacadeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.triangle = new Triangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
