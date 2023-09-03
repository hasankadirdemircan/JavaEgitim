package stream_api;


import java.util.stream.Stream;

public class StreamExample01 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.empty();
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6);

    }
}
