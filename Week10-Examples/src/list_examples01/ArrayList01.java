package list_examples01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println("List : " + numbers);

        int number = numbers.get(2);
        System.out.println("number: " + number);

        int removedNumber = numbers.remove(1);

        System.out.println("removed number : " + removedNumber);
        System.out.println("List : " + numbers);

        List<String> names = new ArrayList<>();
        names.add("java");
        System.out.println(names);
    }
}
