package stream_api.terminal_operation;

import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamExample33 {
    public static void main(String[] args) {
        String frenchCounting = "un:deux:trois:quatre";
        List<String> countList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .toList();
        //                .collect(Collectors.toList());

    }
}
