package stream_api.intermediate_operation;

import java.util.Arrays;

public class StreamExample17 {
    public static void main(String[] args) {
        String[] string = "you never know what you have until you clean your room"
                .split("");

        Arrays.stream(string)
                .map(e -> e.split(""))
                .distinct()
                .forEach(System.out::println);

        String[] string2 = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(string2)
                .flatMap(word -> Arrays.stream(word.split("")))
                .map(e -> e.concat("a"))
                .distinct()
                .forEach(System.out::println);
    }
}
