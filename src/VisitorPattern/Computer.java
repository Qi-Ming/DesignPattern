package VisitorPattern;

public class Computer implements ComputerPart {
    private ComputerPart [] parts;
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
        for(int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
