package parallel_stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamExample04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);
    }
}
