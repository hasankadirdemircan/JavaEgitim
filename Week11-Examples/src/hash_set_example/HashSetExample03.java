package hash_set_example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample03 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

        System.out.println("for-each");
        for(Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("iterator");
        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
