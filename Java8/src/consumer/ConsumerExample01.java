package consumer;

import java.util.function.Consumer;

public class ConsumerExample01 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("bilgeadam");
    }
}
