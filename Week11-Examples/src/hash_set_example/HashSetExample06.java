package hash_set_example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample06 {
    public static void main(String[] args) {
        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        System.out.println("HashSet Even : " + evenNumbers);

        Set<Integer> oddNumbers =  new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(8);
        oddNumbers.add(6);

        evenNumbers.removeAll(oddNumbers); //removeAll methodu, evenNumbers içerisinde oddNumbers ile kesişen değerleri siler.
        System.out.println(evenNumbers);
    }
}
