package CoFPattern;

public class CofPatternDemo {
    public static void main(String[] args) {
        AbstractLogger chain = getChain();
        chain.loadMessage(AbstractLogger.ERROR, "Error");
        chain.loadMessage(AbstractLogger.DEBUG, "File");
        chain.loadMessage(AbstractLogger.INFO, "info");
    }

    private static AbstractLogger getChain() {
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(infoLogger);
        return errorLogger;
    }
}
