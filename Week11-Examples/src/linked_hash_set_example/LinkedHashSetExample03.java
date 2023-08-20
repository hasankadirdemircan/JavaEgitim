package linked_hash_set_example;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample03 {
    public static void main(String[] args) {
        Set<Integer> oddNumbers =   new LinkedHashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(8);
        oddNumbers.add(6);

        System.out.println(oddNumbers);
        oddNumbers.remove(6);
        System.out.println("after remve");
        System.out.println(oddNumbers);

        oddNumbers.removeAll(oddNumbers);
        System.out.println("after remveAll");
        System.out.println(oddNumbers);


    }
}
