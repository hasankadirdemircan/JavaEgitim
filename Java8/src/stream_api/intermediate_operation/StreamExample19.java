package stream_api.intermediate_operation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample19 {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Python"),
                Arrays.asList("C", "C++", "C#"),
                Arrays.asList("JavaScript", "TypeScript", "Node.js")
        );

        List<String> flattenedList = nestedList.stream()
                .flatMap(Collection::stream) // Her alt liste için Stream oluşturup birleştirme
                .collect(Collectors.toList());

        System.out.println(flattenedList);

    }
}
