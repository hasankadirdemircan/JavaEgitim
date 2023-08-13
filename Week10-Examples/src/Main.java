import java.util.*;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Main {
    public static void main(String[] args) {

        //HashMap null ile çalışır.
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null,null);
        System.out.println("hashmap");
        System.out.println(hashMap);

        //LinkedHashMap null ile çalışır.
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null,null);
        System.out.println("linkedHashMap");
        System.out.println(linkedHashMap);

        //EnumMap null ile çalışmaz. NullPointerException
        EnumMap<Days, String> enumMap = new EnumMap<>(Days.class);
        enumMap.put(null, null);
        System.out.println("enumMap");
        System.out.println(enumMap);

        //TreeMap null ile çalışmaz. NullPointerException
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put(null,null);
        System.out.println("treeMap");
        System.out.println(treeMap);

    }
}