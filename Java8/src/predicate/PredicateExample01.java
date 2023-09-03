package predicate;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample01 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("h");
        Predicate<String> predicate2 = (String element) -> element.startsWith("h");
        /*String name = "java";
        boolean tf = name.startsWith("h");*/
        Predicate<String> predicate3 = (String element) -> {
            return element.startsWith("h");
        };

        System.out.println(predicate1.test("hasan"));
        Stream<String> names = Stream.of("java8", "hasan", "kadir", "demircan", "hello");
        names.filter(predicate1).forEach(System.out::println);
        /*  Stream<String> namesH = names.filter(predicate1);
        namesH.forEach(System.out::println);
         */


    }
}
