package predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample02 {
    public static void main(String[] args) {
        List<String> myList = List.of("java8", "hasa", "kadir", "demircan", "hello");

        Stream<String> myStream = myList.stream();

        Predicate<String> predicate1 = e -> e.length() == 4;

        myStream.filter(predicate1).forEach(System.out::println);
    }
}
