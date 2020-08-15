package CommandPattern;

public class Stock {
    private static final String name = "HAIWEI";
    private static final int quantity = 10;

    public void buy() {
        System.out.println("Stock :" + name + "quantity :" + quantity + "bought");
    }

    public static void sell() {
        System.out.println("Stock :" + name + "quantity" + quantity + "sold");
    }
}
