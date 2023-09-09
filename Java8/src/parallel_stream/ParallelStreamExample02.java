package parallel_stream;

import java.util.Arrays;

public class ParallelStreamExample02 {
    public static void main(String[] args) {
        Arrays.asList("jackal", "kangaroo", "lemur").parallelStream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);

        Arrays.asList("jackal", "kangaroo", "lemur").stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);
    }
}
