package CompositeEntityPattern;

public class CompositeEntityPattern {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("test", "data");
        client.printData();
        client.setData("test2", "data2");
        client.printData();
    }
}
