package optional;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class OptionalExample09 {
    public static void main(String[] args) {
    }
    public static void selectHighestTemperature(DoubleStream temperatures){
        OptionalDouble max = temperatures.max();
        max.ifPresent(System.out::println);
    }
}
