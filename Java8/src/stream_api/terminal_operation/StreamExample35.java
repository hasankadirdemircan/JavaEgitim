package stream_api.terminal_operation;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample35 {
    public static void main(String[] args) {
        Map<String, Integer> mapNames = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, String::length));

        mapNames.size();
        System.out.println(mapNames);
    }
}
