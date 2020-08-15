package IteratorPattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        for(Iterator iterator = repository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
