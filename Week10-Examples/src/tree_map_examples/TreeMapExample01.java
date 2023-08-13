package tree_map_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample01 {

    public static void main(String[] args) {
        TreeMap<Integer, String> evenNumbers = new TreeMap<>();
        evenNumbers.put(3, "three");
        evenNumbers.put(7, "seven");
        evenNumbers.put(1, "one");
        System.out.println(evenNumbers);

        TreeMap<Integer, String> evenNumbers2 = new TreeMap<>();
        evenNumbers2.put(5, "five");
        evenNumbers2.put(9, "nine");

        evenNumbers.putAll(evenNumbers2);

        System.out.println(evenNumbers);

        System.out.println(evenNumbers.get(5));
        System.out.println(evenNumbers.keySet());
        System.out.println(evenNumbers.values());
        System.out.println(evenNumbers.entrySet());
        System.out.println(evenNumbers.size());

        evenNumbers.remove(1);
        for(Map.Entry<Integer, String> entry : evenNumbers.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " => " + value);
        }

        evenNumbers.putIfAbsent(3, "uc");
        System.out.println(evenNumbers.entrySet());
        evenNumbers.putIfAbsent(1, "bir");
        System.out.println(evenNumbers.entrySet());

        evenNumbers.remove(1, "one");
        System.out.println(evenNumbers.entrySet());
        evenNumbers.remove(1);
        System.out.println(evenNumbers.entrySet());


    }
}
