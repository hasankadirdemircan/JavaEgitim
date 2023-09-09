package parallel_stream;

import java.util.Arrays;

public class ParallelStreamExample14 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce("X", String::concat));
    }
}
