package stream_api.terminal_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample28 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
       // s.forEach(System.out::print); // MonkeyGorillaBonobo
// Consumer
// void accept(T t);

        //NOT: Stream'i 1 kez kullandıktan sonra Stream pipeline kapanır.
        //Bu yüzden ikinci kez kullanımda hata alabilirsiniz.
        List<String> list = new ArrayList<>();
        s.forEach((str) ->
        {
            String sUpper = str.toUpperCase();
            list.add(sUpper);
        });

        System.out.println(list);
    }
}
