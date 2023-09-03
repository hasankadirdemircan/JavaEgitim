package stream_api.intermediate_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample09 {
    public static void main(String[] args) {
     //   List<Integer> numbers = Arrays.asList(1,2,3,4,5);
       // numbers.stream().forEach(System.out::println);
        IntStream.rangeClosed(0,10)
                .filter(i -> (i % 2 == 0))
                .map(i -> i * 3)
                .forEach(System.out::println);
    }
}
