package TemplatePattern;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game initialize");
    }

    @Override
    void start() {
        System.out.println("Cricket game start");
    }

    @Override
    void end() {
        System.out.println("Cricket game end");
    }
}
