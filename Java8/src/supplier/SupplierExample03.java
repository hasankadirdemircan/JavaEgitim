package supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample03 {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Supplier<LocalDateTime> currentDateTime = LocalDateTime::now;
        System.out.println(currentDateTime.get());

        Supplier<String> supplier02 = () -> dtf.format(LocalDateTime.now());
        System.out.println(supplier02.get());

        Supplier<String> supplier03 = () -> dtf2.format(LocalDateTime.now());
        System.out.println(supplier03.get());

        Supplier<String> supplier04 = () -> dtf3.format(LocalDateTime.now());
        System.out.println(supplier04.get());

        Stream.generate(LocalDateTime::now).limit(10).forEach(System.out::println);
        Stream.generate(supplier03).limit(10).forEach(System.out::println);

    }
}
