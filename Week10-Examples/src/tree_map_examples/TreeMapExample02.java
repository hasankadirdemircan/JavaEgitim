package tree_map_examples;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample02 {
    public static void main(String[] args) {
        // HashMap example
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Üç");
        hashMap.put(1, "Bir");
        hashMap.put(2, "İki");

        System.out.println("HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Anahtar: " + key + ", Değer: " + hashMap.get(key));
        }

        // TreeMap example
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Üç");
        treeMap.put(1, "Bir");
        treeMap.put(2, "İki");

        System.out.println("\nTreeMap:");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Anahtar: " + key + ", Değer: " + treeMap.get(key));
        }
    }
}

