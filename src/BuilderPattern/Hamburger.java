package BuilderPattern;

public class Hamburger extends Food{
    @Override
    public String name() {
        return "Hamburger";
    }

    @Override
    public Float price() {
        return 20f;
    }
}
