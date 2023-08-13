package tree_map_examples;

import java.util.HashMap;
import java.util.TreeMap;

class TreeMapExample04 {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Third", 3);
        numbers.put("Five", 5);
        System.out.println("TreeMap: " + numbers);

        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());

        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());

        HashMap<String, String> hashMap = new HashMap<>();
       // hashMap.lastEntry(); Error çünkü yok. Çünkü HashMap'de sıra garanti değil..!
    }
}
