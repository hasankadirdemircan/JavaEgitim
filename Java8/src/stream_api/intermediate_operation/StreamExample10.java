package stream_api.intermediate_operation;

import java.util.stream.Stream;

public class StreamExample10 {
    public static void main(String[] args) {
        Stream.of("Hasan", "Kadir", "", "Java")
                .filter(name -> !name.isEmpty())
                .forEach(System.out::println);
    }
}
