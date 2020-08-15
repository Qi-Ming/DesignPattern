package CommandPattern;

public class Buy implements Order {
    private Stock stock;

    public Buy(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
