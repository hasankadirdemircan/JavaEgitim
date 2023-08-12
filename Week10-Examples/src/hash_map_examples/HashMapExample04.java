package hash_map_examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample04 {
    public static void main(String[] args) {
        Map<String, Integer> primeNumbers = new HashMap<>();
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        System.out.println("prime numbers: " + primeNumbers);

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);

        numbers.putAll(primeNumbers);
        System.out.println(numbers);

        Map<String, Integer> numbers2 = new HashMap<>();
        numbers2.put("Two", 4);

        numbers.putAll(numbers2);

        System.out.println(numbers);
    }
}
