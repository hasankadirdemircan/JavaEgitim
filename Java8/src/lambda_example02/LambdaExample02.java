package lambda_example02;

import java.util.function.Predicate;

public class LambdaExample02 {
    public static void main(String[] args) {
        LambdaFunctionWithParameter function = (String message) -> System.out.println(message);
        LambdaFunctionWithParameter function2 = (message) -> System.out.println(message);
        LambdaFunctionWithParameter function3 = message -> System.out.println(message);
        LambdaFunctionWithParameter function4 = (String message) -> {
            System.out.println(message);
        };

        LambdaFunctionWithParameter function5 = System.out::println;


        function5.message("Hello lambda expression");
    }
}
