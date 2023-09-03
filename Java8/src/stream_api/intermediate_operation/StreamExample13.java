package stream_api.intermediate_operation;

import java.util.stream.Stream;

public class StreamExample13 {
    public static void main(String[] args) {
        Stream.of("hasan", "kadir", "demircan")
                .map(String::length)
                .forEach(System.out::print);

    }
}
