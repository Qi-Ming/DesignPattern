package BusinessDelegatePatern;

public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate delegate = new BusinessDelegate("JMS");
        Client client = new Client(delegate);
        client.doTask();
        delegate.setType("EJB");
        client.doTask();
    }
}
