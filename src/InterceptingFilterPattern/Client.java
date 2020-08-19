package InterceptingFilterPattern;

public class Client {
    private FilterManager filterManager;

    public Client(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.execute(request);
    }
}
