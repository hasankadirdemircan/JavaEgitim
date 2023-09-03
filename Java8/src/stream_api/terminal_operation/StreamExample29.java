package stream_api.terminal_operation;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample29 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        Stream<String> s2 = Stream.of("Monkey", "Gorilla", "Bonobo");

       List<String> names =  s2.map(e -> e + e).toList();
        System.out.println(names);
        s.forEach(e -> System.out.println(e + e));
    }
}
