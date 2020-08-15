package Test.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 1; i < 10000; i++) {
            test.add(i);
        }
        traverseByIterator(test);
        traverseByIndex(test);
        traverseByFor(test);
    }

    private static void traverseByIterator(ArrayList<Integer> integers) {
        System.out.println("迭代器遍历\n");
        long startTime = System.nanoTime();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext())
            iterator.next();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    private static void traverseByIndex(ArrayList<Integer> integers) {
        System.out.println("\n根据索引遍历\n");
        long startTime = System.nanoTime();
        for(int i = 0; i < integers.size(); i++) {
            integers.get(i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    private static void traverseByFor(ArrayList<Integer> integers) {
        System.out.println("\nForEach遍历\n");
        long startTime = System.nanoTime();
        for(Integer integer : integers) {
            ;
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
