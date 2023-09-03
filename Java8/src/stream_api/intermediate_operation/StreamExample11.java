package stream_api.intermediate_operation;

import java.util.stream.Stream;

public class StreamExample11 {
    public static void main(String[] args) {
        Stream.of("Java", "Java", "Java8", "JAva")
              //  .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);
    }
}
