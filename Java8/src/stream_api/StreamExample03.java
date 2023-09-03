package stream_api;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public class StreamExample03 {
    public static void main(String[] args) {
        Arrays.stream(Objects.class.getMethods()) //source
                .map(Method::getName) // intermadiate operation
                .distinct() //indermatiate operation
                .forEach(System.out::println); // terminal operation
        //.toList() terminal operation
    }
}
