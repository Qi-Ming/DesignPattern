package ProtoTypePattern;

public class Triangle extends Shape {
    @Override
    void Draw() {
        System.out.println("Triangle");
    }

    public Triangle() {
        this.type = "Triangle";
    }
}
