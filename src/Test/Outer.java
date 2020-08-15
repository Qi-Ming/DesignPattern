package Test;

public class Outer {
    private static int a = 0;
    private String s = "123";


    static class Inner {
        Outer outer = new Outer();
        private  static int a1 = Outer.a;
        private String s = outer.s;
    }
}
