package stream_api.terminal_operation;

import java.util.stream.Stream;

public class StreamExample32 {
    public static void main(String[] args) {
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", (s, c) -> s + c +"--");
        System.out.println(word2); //w--o--l--f--
    }
}
