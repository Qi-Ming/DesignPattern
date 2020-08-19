package InterceptingFilterPattern;

public class InterceptingFilterPatternDemo {
    public static void main(String[] args) {
        Target target = new Target();
        FilterManager filterManager = new FilterManager(target);
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new DebugFilter());
        Client client = new Client(filterManager);
        client.sendRequest("Home");
    }
}
