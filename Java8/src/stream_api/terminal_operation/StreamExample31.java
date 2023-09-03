package stream_api.terminal_operation;

import java.util.stream.Stream;

public class StreamExample31 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w1", "o2", "l3", "f4");
        String word = stream.reduce("X", String::concat);
        System.out.println(word); // Xw1o2l3f4
    }
}
