package hash_map_examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {
        //sınıftaki programlama dili bilenlerin sayısı
        Map<String, Integer> languages = new HashMap<>();

        languages.put("Java", 8);
        languages.put("Python", 3);
        languages.put("Scala", 1);

        System.out.println("HasMap: " + languages);
    }
}
