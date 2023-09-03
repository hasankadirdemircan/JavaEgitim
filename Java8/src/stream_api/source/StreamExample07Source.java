package stream_api.source;

import java.util.regex.Pattern;

public class StreamExample07Source {
    public static void main(String[] args) {
        Pattern.compile(" ")
                .splitAsStream("java 8 stream")
                .forEach(System.out::println);
    }
}
