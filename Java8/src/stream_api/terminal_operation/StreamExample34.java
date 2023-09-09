package stream_api.terminal_operation;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamExample34 {
    public static void main(String[] args) {
        String frenchCounting = "un:deux:trois:quatre";
        Set<String> countList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toSet());


    }
}
