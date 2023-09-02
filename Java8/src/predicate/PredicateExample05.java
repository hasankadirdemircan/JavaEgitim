package predicate;

import java.util.function.Predicate;

public class PredicateExample05 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = String::isEmpty;
        Predicate<String> predicate2 = e -> e.isEmpty();
      /*  Predicate<String> predicate11 = String::length;
        //compile error, length methodu  geri donusu int.(boolean olmalı.)*/
        System.out.println(predicate1.test("h"));
        System.out.println(predicate1.test(""));

        //;Before Java8
        String name = "h";
        name.isEmpty();
    }


}
