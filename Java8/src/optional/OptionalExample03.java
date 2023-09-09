package optional;

import java.util.Optional;

public class OptionalExample03 {
    public static void main(String[] args) {
        Optional<String> nullStr = Optional.ofNullable(null);
        System.out.println(nullStr);
    }
}
