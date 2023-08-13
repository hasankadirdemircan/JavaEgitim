package tree_map_examples;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample06 {
    public static void main(String[] args) {
        TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(3, "three");
        numbers.put(7, "seven");
        numbers.put(1, "one");
        numbers.put(5, "five");
        numbers.put(9, "nine");
        numbers.put(8, "eight");
        System.out.println(numbers);

        System.out.println("Ceiling Function");
        System.out.println(numbers.ceilingEntry(4));
        System.out.println(numbers.ceilingKey(4));
        System.out.println(numbers.ceilingEntry(5));

        System.out.println("Floor Function");
        System.out.println(numbers.floorEntry(5));
        System.out.println(numbers.floorEntry(4));

        Map.Entry<Integer,String> removedEntry = numbers.pollFirstEntry();
        System.out.println("After pollFirstEntry");
        System.out.println(numbers);
        System.out.println("removed entry is : " + removedEntry);
    }
}
