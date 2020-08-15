package BuilderPattern;

public abstract class Food implements Item {

    @Override
    public abstract Float price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
