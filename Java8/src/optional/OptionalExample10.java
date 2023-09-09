package optional;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Comparator.naturalOrder;

public class OptionalExample10 {
    public static void main(String[] args) {

    //    selectHighestTemperature(Stream.of(1.0, 2.0, null, 3.0, 4.0));
        selectHighestTemperature(Stream.of(null, null));
    }
    public static void selectHighestTemperature(Stream<Double> temperatures){
        Double maxValue = temperatures
                .filter(Objects::nonNull)
                .max(naturalOrder())
                .orElse(0.0);
        System.out.println();
    }
}
