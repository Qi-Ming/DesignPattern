package VisitorPattern;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerPartDisplayVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();
        computer.accept(computerPartDisplayVisitor);
    }
}
