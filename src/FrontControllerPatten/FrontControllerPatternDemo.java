package FrontControllerPatten;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController controller = new FrontController();
        controller.dispatchRequest("STUDENT");
        controller.dispatchRequest("HOME");
    }
}
