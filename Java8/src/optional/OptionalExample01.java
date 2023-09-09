package optional;

import java.util.Optional;

public class OptionalExample01 {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();

        Optional<String> op1 = Optional.of("value");
        System.out.println(op1);
        System.out.println(op1.get());
        System.out.println(emptyOptional);
    }
}
