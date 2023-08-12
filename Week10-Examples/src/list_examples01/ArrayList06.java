package list_examples01;

import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.replaceAll(e -> e * 2);
        System.out.println(numbers);

    }
}
