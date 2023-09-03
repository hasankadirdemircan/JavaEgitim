package stream_api.intermediate_operation;

import java.util.Arrays;
import java.util.List;

public class StreamExample14 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");

        List<Integer> intNumbers = numbers.stream()
                .map(Integer::valueOf)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .filter(e -> e > 5)
                .map(e -> e + 10)
                .map(e -> e * 3)
                .toList();

        intNumbers.forEach(System.out::println);
    }
}
