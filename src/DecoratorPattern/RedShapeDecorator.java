package DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void Draw() {
        super.Draw();
        setBorder();
    }

    public void setBorder() {
        System.out.println("border color : red");
    }
}
