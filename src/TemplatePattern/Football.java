package TemplatePattern;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("football game initialize");
    }

    @Override
    void start() {
        System.out.println("football game start");
    }

    @Override
    void end() {
        System.out.println("football game end");
    }
}
