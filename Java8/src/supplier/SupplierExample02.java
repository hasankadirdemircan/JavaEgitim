package supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample02 {
    public static void main(String[] args) {
        Supplier<Integer> supplier01 = () -> new Random().nextInt(20);
     //   System.out.println(supplier01.get());

      //  List<Integer> numbers = Stream.generate(supplier01).limit(10).toList();
        Stream.generate(supplier01).limit(10).forEach(System.out::println);
    }
}
