package parallel_stream;

import java.util.Arrays;

public class ParallelStreamExample13 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6)
                .parallelStream()
                .reduce(0,(a,b) -> (a-b))); // NOT AN ASSOCIATIVE ACCUMULATOR
    }
}
