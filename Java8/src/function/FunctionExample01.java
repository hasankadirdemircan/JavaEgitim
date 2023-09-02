package function;

import java.util.function.Function;

public class FunctionExample01 {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction1 = e -> e.length();
        Function<String, Integer> lengthFunction2 = String::length;

        int result = lengthFunction1.apply("bilgiadam");
        int result2 = lengthFunction2.apply("bilgiadam12");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(lengthFunction1.apply("bilgiadam"));
    }
}
