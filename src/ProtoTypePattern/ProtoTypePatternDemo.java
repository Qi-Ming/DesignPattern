package ProtoTypePattern;

public class ProtoTypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadShapeCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println(cloneShape.getType());

        Shape cloneShape1 = ShapeCache.getShape("2");
        System.out.println(cloneShape1.getType());

        Shape cloneShape2 = ShapeCache.getShape("3");
        System.out.println(cloneShape2.getType());
    }
}
