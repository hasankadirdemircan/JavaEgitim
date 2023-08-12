package hash_map_examples;

import java.util.HashMap;
import java.util.TreeMap;

class HashMapExample08 {
    public static void main(String[] args) {

        // create a treemap
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        //1. solution
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Three", 3);
        hashMap.putAll(evenNumbers);
        System.out.println(hashMap);
        // create hashmap from the treemap
        //2. solution
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);
    }
}