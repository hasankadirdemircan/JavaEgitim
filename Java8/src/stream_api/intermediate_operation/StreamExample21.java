package stream_api.intermediate_operation;

import java.util.stream.Stream;

public class StreamExample21 {
    public static void main(String[] args) {
       /* Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
                 OutOfMemoryError
*/

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
