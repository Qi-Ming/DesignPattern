package Test;

public class StaticBlock {
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("匿名代码块1");
    }

    public StaticBlock(){
        System.out.println("执行构造函数");
    }

    {
        System.out.println("匿名代码块2");
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println("------------------");
        StaticBlock staticBlock1 = new StaticBlock();
    }

}
