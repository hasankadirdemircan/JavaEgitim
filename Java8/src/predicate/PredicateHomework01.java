package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PredicateHomework01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<100; i++) {
           numbers.add(i);
        }

      //  Stream<Integer> integerStream = IntStream.rangeClosed(1, 100);
        Predicate<Integer> isEven = e -> e % 2 == 0;
        List<Integer> evenList = new ArrayList<>();
        numbers.stream().filter(isEven).forEach(evenList::add);

        List<Integer> evenListV2 = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenListV2);
    }
}
