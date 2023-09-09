package optional;

import java.util.Optional;

public class OptionalExample02 {
    public static void main(String[] args) {
        Optional<String> nullStr = Optional.of(null);
        nullStr.ifPresent(System.out::println);
        //Exception in thread "main" java.lang.NullPointerException
    }
}
