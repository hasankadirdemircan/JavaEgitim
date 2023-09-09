package stream_api.terminal_operation;

import java.util.stream.Stream;

public class StreamExample30 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 5, 6, 7, 2);
        Stream<Integer> stream2 = Stream.of(3, 5, 6, 7);

        System.out.println(stream.reduce(10, (a, b) -> a * b));

        System.out.println(stream2.reduce((a, b) -> a * b));
    }
}
