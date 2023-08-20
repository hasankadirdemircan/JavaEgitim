package hash_set_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsHashSet {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(null);
        numbers.add(null);

        System.out.println("Numbers : " + numbers);

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(1);
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(2);
        numbers2.add(null);
        numbers2.add(null);

        System.out.println("Numbers2 : " + numbers2);
    }
}
