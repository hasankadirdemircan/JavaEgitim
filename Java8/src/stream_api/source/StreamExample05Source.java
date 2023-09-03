package stream_api.source;

import java.util.stream.IntStream;

public class StreamExample05Source {
    public static void main(String[] args) {
        IntStream.iterate(10, i -> i - 1)
                .limit(10)
                .forEach(System.out::println);

        IntStream.iterate(10, i -> i + 5)
                .limit(6)
                .forEach(System.out::println);

        System.out.println("example");
        IntStream.rangeClosed(1, 100)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
    }
}
