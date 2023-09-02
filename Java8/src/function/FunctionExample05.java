package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionExample05 {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> incrementExact = Math::incrementExact;

        Function<String, Integer> parseIntAndIncrementExact = parseInt.andThen(incrementExact);
        Stream.of("-3", "11", "25", "30", "-1", "-11")
                .map(parseIntAndIncrementExact)
                .forEach(System.out::println);


        System.out.println("-------------------------------------");
        List<String> alpha = Arrays.asList("a a", "b b", "c c", "d d");
        Function<String, String> upperCaseFunction = String::toUpperCase;
       // alpha.stream().map(upperCaseFunction).toList();//java 16
        List<String> upperCaseList = alpha.stream().map(upperCaseFunction).collect(Collectors.toList());
        System.out.println(upperCaseList);
        List<String> upperCaseList2 = alpha.stream().map(upperCaseFunction).toList();
        System.out.println(upperCaseList2);

    }
}
