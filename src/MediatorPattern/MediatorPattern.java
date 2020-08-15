package MediatorPattern;

public class MediatorPattern {
    public static void main(String[] args) {
        User John = new User("John");
        User Kate = new User("Kate");
        John.sendMessage("hello, Kate");
        Kate.sendMessage("hi, John");
    }
}
