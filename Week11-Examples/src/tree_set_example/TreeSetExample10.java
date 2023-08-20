package tree_set_example;

import java.util.TreeSet;

public class TreeSetExample10 {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            System.out.println("TreeSet1: " + numbers);

            TreeSet<Integer> primeNumbers = new TreeSet<>();
            primeNumbers.add(2);
            primeNumbers.add(3);
            System.out.println("TreeSet2: " + primeNumbers);

            // Check if primeNumbers is subset of numbers
            boolean result = numbers.containsAll(primeNumbers);
            System.out.println("Is TreeSet2 subset of TreeSet1? " + result);
        }
}
