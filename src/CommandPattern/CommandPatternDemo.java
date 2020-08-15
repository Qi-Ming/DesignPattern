package CommandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abc = new Stock();
        Buy buy = new Buy(abc);
        Sell sell = new Sell(abc);
        Broker broker = new Broker();
        broker.takeOrder(buy);
        broker.takeOrder(sell);
        broker.placeOrder();
    }
}
