package parallel_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelStreamExample03 {
    public static void main(String[] args) {
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).parallelStream().map(i -> {
            data.add(i); // // AVOID STATEFUL LAMBDA EXPRESSIONS!
            return i;
        }).forEachOrdered(i -> System.out.print(i + " "));

        System.out.println();
        System.out.println(data);
    }
}
