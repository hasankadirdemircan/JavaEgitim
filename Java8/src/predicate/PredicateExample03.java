package predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample03 {
    public static void main(String[] args) {
        Predicate<String> nullCheckPredicate = Objects::nonNull; //e -> e != null;
        Predicate<String> lengthCheckPredicate = e -> (e.length() > 2);

        Predicate<String> andPredicate = nullCheckPredicate.and(lengthCheckPredicate);

        String temp1 = null;
        String temp2 = "java8";
        String temp3 = "hasan";
        String temp4 = "kadir";
        String temp5 = "demircan";
        String temp6 = "ik";

        System.out.println(andPredicate.test(temp1));
        System.out.println(andPredicate.test(temp2));
        System.out.println(andPredicate.test(temp3));
        System.out.println(andPredicate.test(temp4));
        System.out.println(andPredicate.test(temp5));
        System.out.println(andPredicate.test(temp6));
    }
}
