package BuilderPattern;

public class Cola extends Drink {
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public Float price() {
        return 10f;
    }
}
