package hash_map_examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample05 {
    public static void main(String[] args) {
        //putIfAbsent
        Map<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "C");
        languages.put(3, "Java");
        System.out.println("Languages : " + languages);

       languages.putIfAbsent(4, "JavaScript");

       languages.putIfAbsent(2, "Swift");
       System.out.println("Updated Languages: " + languages);

       languages.put(2, "Swift");
       System.out.println("Updated2 Languages: " + languages);

       //get
        System.out.println(languages.get(2));

        //entrySet

        System.out.println("keys: " + languages.keySet());
        System.out.println("values: " + languages.values());
        System.out.println("entrySet: " + languages.entrySet());

        for (Map.Entry<Integer, String> set : languages.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }
}
