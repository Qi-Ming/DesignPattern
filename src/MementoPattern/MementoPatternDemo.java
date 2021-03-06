package MementoPattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator("state #1");
        CareTaker careTaker = new CareTaker();
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #4");

        System.out.println("current state"+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("first saved" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("second saved "+ originator.getState());
    }
}
