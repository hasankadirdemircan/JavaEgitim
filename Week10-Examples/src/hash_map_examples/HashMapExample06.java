package hash_map_examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample06 {
    public static void main(String[] args) {
        Map<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "C");
        languages.put(3, "Java");
        System.out.println("Languages : " + languages);

        System.out.println(languages.get(3));
        System.out.println(languages.getOrDefault(4, "bu değer yok"));
        System.out.println(languages.get(4));
        if(languages.get(4) == null) {
            System.out.println("bu değer yok");
        }

        System.out.println(languages.containsKey(2));
        System.out.println(languages.containsKey(4));

        languages.replace(2, "ReactJS");
        System.out.println(languages);

        for (Map.Entry<Integer, String> set : languages.entrySet()) {
            languages.replace(set.getKey(), set.getValue().toUpperCase());
        }
        System.out.println(languages);
        //JAVA-8

        languages.replaceAll((k,v) -> v.toUpperCase());
       System.out.println(languages);

        System.out.println("after remove");
       languages.remove(2);
        System.out.println(languages);
    }
}
