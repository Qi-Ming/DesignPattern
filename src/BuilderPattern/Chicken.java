package BuilderPattern;

public  class Chicken extends Food {
    @Override
    public String name() {
        return "Chicken";
    }

    @Override
    public Float price() {
        return 15f ;
    }
}
