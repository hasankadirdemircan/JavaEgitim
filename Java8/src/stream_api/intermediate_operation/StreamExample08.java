package stream_api.intermediate_operation;

import java.util.stream.Stream;

public class StreamExample08 {
    public static void main(String[] args) {
        long count = Stream.of("one", "two", "three", "four") //source
                .filter(e -> e.length() > 3) //intermediate
                .peek(e -> System.out.println("Filtered Value: " + e)) //intermediate
                .map(String::toUpperCase) //intermediate
                .peek(e -> System.out.println("Mapped Value: " + e)) //intermediate
                .count(); //terminal

        System.out.println(count);
    }
}
