package consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample02 {
    public static void main(String[] args) {
        Consumer<Integer> consumer1 = e -> System.out.println(e * 2);
        Stream.of(1,2).forEach(consumer1);

        Consumer<Integer> c2 = (Integer x) -> System.out.println(x);
        Stream.of(1,2).forEach(c2);

        Stream.of(1,2).forEach(x -> System.out.println(x+2));

        Stream.of(1,2).forEach(System.out::println);
    }
}
