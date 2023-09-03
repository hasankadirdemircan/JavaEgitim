package stream_api.intermediate_operation;

import java.util.stream.Stream;

public class StreamExample12 {
    public static void main(String[] args) {

        Stream.iterate(10, n -> n + 2)
                .skip(3)
                .limit(5)
                .forEach(System.out::println);

    }
}
