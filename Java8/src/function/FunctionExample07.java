package function;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExample07 {
    public static void main(String[] args) {
        Function<String, Integer> calculateLength = String::length;

      /*  Function<String, Integer> calculateLength = str -> {
            int length = str.length();
            return length*length;
        };*/

        Function<Integer, Integer> square = number -> number * number;

        Function<String, Integer> combinedFunction = calculateLength.andThen(square);

        String text = "Java Programming";
        int result = combinedFunction.apply(text);
        System.out.println("Result : " + result);

    }
}
