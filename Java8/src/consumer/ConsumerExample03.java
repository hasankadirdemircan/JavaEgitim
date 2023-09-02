package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> divedByTwo = e -> {
            System.out.println(e + " divded by 2 is : " + (e / 2));
        };

        numbers.forEach(divedByTwo);
    }
}
