package InterpreterPattern;

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression isMale = isMale();
        Expression isMarried = isMarried();
        System.out.println("John is male "+isMale.interpreter("John"));
        System.out.println("Marry is married "+ isMarried.interpreter("MarryMarried"));


    }

    public static Expression isMale() {
        Expression Robert = new TerminalExpression("Robert");
        Expression John = new TerminalExpression("John");
        return new OrExpression(Robert, John);
    }

    public static Expression isMarried(){
        Expression Marry = new TerminalExpression("Marry");
        Expression isMarried = new TerminalExpression("Married");
        return new AndExpression(Marry, isMarried);
    }
}
