package linked_hash_map_examples;

import java.util.*;

public class LinkedHashMapExample01 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> names = new LinkedHashMap<>();
        names.put("book", "kitap");
        names.put("application", "uygulama");
        names.put("apple", "elma");
        names.put(null, null);
        names.put(null, "a");
        System.out.println("LinkedHashMap: " + names);


        TreeMap<String, String> names2 = new TreeMap<>();
        names2.put("book", "kitap");
        names2.put("application", "uygulama");
        names2.put("apple", "elma");
        names2.put("null", null);
        System.out.println("TreeMap: " + names2);


       User user1 = new User("kadir", "ankara", false);
       User user2 = new User("ahmet", "istanbul", false);
       User user3 = new User("ayse", "kayseri", false);
       List<User> userList = new ArrayList<>();
       userList.add(user1);
       userList.add(user2);
       userList.add(user3);

        User user12 = new User("kadir", "ankara", true);
        User user22 = new User("ahmet", "istanbul", true);
        User user32 = new User("ayse", "kayseri", true);
        List<User> userList2 = new ArrayList<>();
        userList2.add(user12);
        userList2.add(user22);
        userList2.add(user32);

        TreeMap<Boolean, List<User>> userTreeMap = new TreeMap<>();
        userTreeMap.put(false, userList);
        userTreeMap.put(true, userList2);
        System.out.println(userTreeMap);

        for (Map.Entry<Boolean, List<User>> entry : userTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().get(0));
        }


        List<String> singleMatches = Arrays.asList("GS vs FB", "ASTON vs VILLA", "REAL vs BARCA");
        List<String> multipleMatches = Arrays.asList("A vs B", "C vs D", "E vs F");

        LinkedHashMap<Match, List<String>> match = new LinkedHashMap<>();
        match.put(Match.SINGLE, singleMatches);
        match.put(Match.MULTIPLE, multipleMatches);

        System.out.println(match.get(Match.SINGLE));
    }
}
