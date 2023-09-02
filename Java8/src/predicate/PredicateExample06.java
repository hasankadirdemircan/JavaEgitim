package predicate;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample06 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(7);
        numbers.add(30);

        Predicate<Integer> predicate = number -> number % 2 == 0;

        List<Integer> filteredList = filterList(numbers, predicate);
        System.out.println(filteredList);


        List<String> names = Arrays.asList("abc", "bca", "ik", "uc");
        Predicate<String> predicate2 = str -> str.length() > 2;

        List<String> filteredList2 = filterList(names, predicate2);
        System.out.println(filteredList2);

    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for(T item : list) {
            if(predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
