package tree_set_example;

import java.util.TreeSet;

public class TreeSetExample09 {
        public static void main(String[] args) {
            TreeSet<Integer> evenNumbers = new TreeSet<>();
            evenNumbers.add(2);
            evenNumbers.add(4);
            System.out.println("TreeSet1: " + evenNumbers);

            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            System.out.println("TreeSet2: " + numbers);

            // Difference between two sets
            numbers.removeAll(evenNumbers);
            System.out.println("Difference is: " + numbers);
        }
}
