package list_examples01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(11);

        System.out.println("Before sort: " + numbers);

        Collections.sort(numbers);

        System.out.println("After sort: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        numbers.sort(Collections.reverseOrder());

        System.out.println("After reverse: " + numbers);

        System.out.println("Size: " + numbers.size());

        ArrayList numbers2 = (ArrayList) numbers.clone();

        ArrayList<Integer> numbers3 = numbers;

        System.out.println(numbers2);
        System.out.println(numbers3);

        System.out.println(numbers.contains(1));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.isEmpty());
        List<Integer> numbers4 = new ArrayList<>();
        System.out.println(numbers4.isEmpty());

        System.out.println(numbers.indexOf(4));
        System.out.println(numbers.indexOf(2));

        System.out.println("for-each");
        for(Integer number : numbers) {
            System.out.println(number);
        }
    }
}
