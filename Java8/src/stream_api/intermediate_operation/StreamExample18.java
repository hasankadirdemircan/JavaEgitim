package stream_api.intermediate_operation;

import java.util.Arrays;
import java.util.List;

public class StreamExample18 {
    public static void main(String[] args) {
        List<List<Integer>> intsOfInts = Arrays.asList(
                Arrays.asList(1, 3, 5),
                Arrays.asList(2, 4)
        );

        intsOfInts.stream()
                .flatMap(List::stream)
                .sorted()
                .map(i -> i * i)
                .forEach(System.out::println);

    }
}
