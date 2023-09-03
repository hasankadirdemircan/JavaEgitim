package stream_api.intermediate_operation;

import java.util.stream.Stream;

public class StreamExample20 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-", "bee-");
        s.sorted().forEach(System.out::print);
    }
}
