package CommandPattern;

public class Sell implements Order {
    private Stock stock;

    public Sell(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        Stock.sell();
    }
}
