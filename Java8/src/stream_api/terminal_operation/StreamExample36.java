package stream_api.terminal_operation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample36 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);
    }
}
