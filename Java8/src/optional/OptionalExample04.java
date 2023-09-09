package optional;

import java.util.Optional;

public class OptionalExample04 {
    public static void main(String[] args) {
        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim).ifPresent(System.out::println);
    }
}
