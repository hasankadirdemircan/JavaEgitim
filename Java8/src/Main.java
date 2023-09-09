import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = "ankara";
       // name.
        Function<String, Integer> function = e -> e.length();
        Function<String, Integer> function2 = String::length;
        Predicate<String> predicate = e -> e.length() > 3;
        Set<String> list = Stream.of("java", "ankara", "string")
                .filter( e -> e.length() == 6)
                .collect(Collectors.toSet());

        System.out.println(list);
    }
}