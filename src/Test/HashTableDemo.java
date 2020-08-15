package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for(int i = 0; i < 100000; i++) {
            hashMap.put(i, "aaa");
        }
        traverseByEntry(hashMap);
        traverseByIterator(hashMap);
    }

    private static void traverseByEntry(HashMap hashMap) {
        long startTime = System.nanoTime();
        Integer key;
        String value;
        Iterator<Map.Entry<Integer, String>> entryIterator = hashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            key = entry.getKey();
            value = entry.getValue();
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    private static void traverseByIterator(HashMap hashMap) {
        long startTime = System.nanoTime();
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext())
            iterator.next();
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }

}
