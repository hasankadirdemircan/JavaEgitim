package tree_set_example;

import java.util.*;

public class TreeSetExample01 {
    public static void main(String[] args) {
        Set<Integer> numbers =   new TreeSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);

        System.out.println("numbers : " + numbers);

        NavigableSet<String> names = new TreeSet<>();
        names.add("Zara");
        names.add("Mavi");
        names.add("Adidas");
        names.add("Lacoste");

        System.out.println(names);
        names = names.descendingSet();
        System.out.println(names);
        
    }


}
