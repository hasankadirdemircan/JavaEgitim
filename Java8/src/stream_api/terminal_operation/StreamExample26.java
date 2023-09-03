package stream_api.terminal_operation;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class StreamExample26 {
    public static void main(String[] args) {
        OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();

        OptionalDouble temperature2 = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findAny();

        System.out.println(temperature);
        System.out.println(temperature2);
    }
}
