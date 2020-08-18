package FrontControllerPatten;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void trackRequest(String request) {
        System.out.println("page requested" + request);
    }

    public boolean isAuthenticUser() {
        System.out.println("user is authenticated successful");
        return true;
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if(isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
