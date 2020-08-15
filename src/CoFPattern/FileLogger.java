package CoFPattern;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }
    @Override
    void write(String message) {
        System.out.println("Standard FileLogger "+message);
    }
}
