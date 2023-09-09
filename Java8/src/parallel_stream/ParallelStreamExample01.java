package parallel_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamExample01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        Stream<Integer> streamParallel = stream.parallel();//.count();
        long sum = streamParallel.mapToInt(Integer::valueOf).sum();
        System.out.println(sum);

      //  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().parallel().count();
    }
}
