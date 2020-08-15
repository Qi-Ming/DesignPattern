package ProtoTypePattern;

public class Circle extends Shape {
    @Override
    void Draw() {
        System.out.println("Shape");
    }

    public Circle() {
        this.type = "circle";
    }
}
