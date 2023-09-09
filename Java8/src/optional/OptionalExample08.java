package optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample08 {
    public static void main(String[] args) {

    }
    public static void selectHighestTemperature(Stream<Double> temperatures) {
        Optional<Double> max = temperatures.max(Double::compareTo);
        max.ifPresent(System.out::println);
    }
}
