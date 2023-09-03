package stream_api.terminal_operation;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample23 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("monkey", "ape", "bonobo");
        Stream<String> stream2 = Stream.of("monkey", "ape", "bonobo");

        Comparator<String> comp = Comparator.comparingInt(String::length);

        Optional<String> min = stream1.min(comp);
        Optional<String> max = stream2.max(comp);

        System.out.println(min);
        System.out.println(max);

        Comparator<Integer> comp2 = Comparator.comparingInt(Integer::intValue);

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4);
        System.out.println(stream3.min(comp2));
        System.out.println(stream4.max(comp2));

    }
}
