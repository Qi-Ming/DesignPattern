package SingletonPattern;

public class Singleton6 {
    private Singleton6(){}

    private enum Singleton {
        INSTANCE;
        private Singleton6 singleton6;

        private Singleton(){
            singleton6 = new Singleton6();
        }

        public  Singleton6 getInstance(){
            return singleton6;
        }
    }
}
