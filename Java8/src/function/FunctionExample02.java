package function;

import java.util.function.Function;

public class FunctionExample02 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = str -> Integer.parseInt(str);
        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println(f1.apply("5"));

        Function<Integer, Integer> f3 = Math::abs;
        System.out.println(f3.apply(-11));
    }
}
