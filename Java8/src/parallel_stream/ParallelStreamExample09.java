package parallel_stream;

import java.util.Arrays;

public class ParallelStreamExample09 {
    public static void main(String[] args) {
        Arrays.asList(1, 5, 20, 4, 3, 8, 100)
                .stream()

                .parallel()
                .forEach(System.out::println);
    }
}
