package stream_api.source;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample04Source {
    public static void main(String[] args) {
        IntStream.range(1, 10) //source
                .forEach(System.out::println); //terminal

        System.out.println("rangeClosed()");
        IntStream.rangeClosed(1, 10) //source
                .forEach(System.out::println);//terminal

        System.out.println("rangeClosed()2");
        IntStream.rangeClosed(1, 10) //source
                .map(e -> e * 2) //intermediate
                .forEach(System.out::println);//terminal

    }
}
