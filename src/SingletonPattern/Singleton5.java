package SingletonPattern;

public class Singleton5 {
    private static class SingletonHolder {
        private final static Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5(){}

    public static final Singleton5 getInstance() {
        return  SingletonHolder.INSTANCE;
    }
}
