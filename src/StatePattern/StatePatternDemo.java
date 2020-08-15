package StatePattern;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
