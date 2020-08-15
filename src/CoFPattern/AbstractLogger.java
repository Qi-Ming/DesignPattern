package CoFPattern;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void loadMessage(int level1, String message) {
        if(level <= level1) {
            write(message);
        }
        if(nextLogger != null) {
            nextLogger.loadMessage(level1, message);
        }
    }

    abstract void write(String message);
}
