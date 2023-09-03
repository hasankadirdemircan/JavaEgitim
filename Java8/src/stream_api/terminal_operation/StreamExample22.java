package stream_api.terminal_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample22 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("k1", "k2", "k3");
        long countElement = s1.count();
        System.out.println(countElement);

        List<String> names = Arrays.asList("1", "2", "3", "4");
        long count2 = names.stream()
                .count();
        System.out.println(count2);
    }
}
