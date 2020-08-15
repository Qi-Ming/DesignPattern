package TemplatePattern;

import FlyWeightPattern.Circle;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.play();
        Football football = new Football();
        football.play();
    }
}
