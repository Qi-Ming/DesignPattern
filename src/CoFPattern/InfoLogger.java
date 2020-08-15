package CoFPattern;

public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        this.level = level;
    }
    @Override
    void write(String message) {
        System.out.println("Stand InfoLogger" + message);
    }
}
