package tree_map_examples;

import java.util.TreeMap;

public class TreeMapExample05 {
    public static void main(String[] args) {
        TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(3, "three");
        numbers.put(7, "seven");
        numbers.put(1, "one");
        numbers.put(5, "five");
        numbers.put(9, "nine");
        numbers.put(8, "eight");
        System.out.println(numbers);

        System.out.println("Higher");
        System.out.println(numbers.higherKey(5));
        System.out.println(numbers.higherEntry(5));

        System.out.println("Lower");
        System.out.println(numbers.lowerKey(5));
        System.out.println(numbers.lowerEntry(5));
    }
}
