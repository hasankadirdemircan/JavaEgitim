package enum_map_examples;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapExamples01 {
    public static void main(String[] args) {
        // Create an EnumMap with Days enum as keys and String as values
        Map<Days, String> enumMap = new EnumMap<>(Days.class);

        // Add key-value pairs
        enumMap.put(Days.MONDAY, "First day");
        enumMap.put(Days.TUESDAY, "Second day");
        enumMap.put(Days.WEDNESDAY, "Third day");

        // Access values using enum keys
        System.out.println("Value for MONDAY: " + enumMap.get(Days.MONDAY));
        System.out.println("Value for TUESDAY: " + enumMap.get(Days.TUESDAY));
        System.out.println("Value for WEDNESDAY: " + enumMap.get(Days.WEDNESDAY));

        System.out.println("---- HASH MAP------");
        Map<Days, String> hashMap = new HashMap<>();
        // Add key-value pairs
        hashMap.put(Days.MONDAY, "First day");
        hashMap.put(Days.TUESDAY, "Second day");
        hashMap.put(Days.WEDNESDAY, "Third day");

        // Access values using enum keys
        System.out.println("Value for MONDAY: " + hashMap.get(Days.MONDAY));
        System.out.println("Value for TUESDAY: " + hashMap.get(Days.TUESDAY));
        System.out.println("Value for WEDNESDAY: " + hashMap.get(Days.WEDNESDAY));
    }
}
