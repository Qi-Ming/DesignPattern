package FrontControllerPatten;

public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if(request.equalsIgnoreCase("student")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
