package ProtoTypePattern;

public class Rectangle extends Shape {
    @Override
    void Draw() {
        System.out.println("Rectangle");
    }

    public Rectangle() {
        this.type = "Rectangle";
    }
}
