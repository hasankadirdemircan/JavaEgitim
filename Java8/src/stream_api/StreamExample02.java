package stream_api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample02 {
    public static void main(String[] args) {
       List<String> list = Arrays.asList("a", "b", "c");
       Stream<String> fromList = list.stream();
    }
}
