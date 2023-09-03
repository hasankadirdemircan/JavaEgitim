package stream_api.intermediate_operation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExample16 {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        /*
          List<Integer> flattenedList = nestedList.stream()
                .map(List::stream) // Her iç liste için Stream oluşturup birleştirme
                .forEach(System.out::println);
         */
        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream) // Her iç liste için Stream oluşturup birleştirme
               // .map()
                .toList();
        System.out.println(flattenedList);

    }
}
