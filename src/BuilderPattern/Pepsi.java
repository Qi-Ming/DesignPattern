package BuilderPattern;

public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Float price() {
        return 7f;
    }
}
