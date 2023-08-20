package hash_set_example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample04 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Numbers : " + numbers);

        numbers.remove(2);
        System.out.println("Numbers : " + numbers);

        numbers.removeAll(numbers);
        System.out.println("Numbers : " + numbers);


    }
}
