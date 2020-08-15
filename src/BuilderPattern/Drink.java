package BuilderPattern;

public abstract class Drink implements Item {

    @Override
    public abstract Float price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
