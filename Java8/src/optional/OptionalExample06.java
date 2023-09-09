package optional;

import java.util.Optional;

public class OptionalExample06 {
    public static void main(String[] args) {
        Optional<Double> opt = Optional.empty();

        System.out.println(opt.orElse(0.0));
        System.out.println(opt.orElseGet(Math::random));
        System.out.println(opt.orElseThrow(IllegalStateException::new));
    }
}
