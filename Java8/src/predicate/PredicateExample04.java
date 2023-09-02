package predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateExample04 {
    public static void main(String[] args) {
        List<String> stringTempList = new ArrayList<>();
        stringTempList.add("java8");
        stringTempList.add("hasan");
        stringTempList.add("kadir");
        stringTempList.add("demircan");
        stringTempList.add("hello");


       /* Before Java 8
        for (String str : stringTempList) {
            if(str.startsWith("h")) {
                stringTempList.remove(str);
            }
        }*/
        stringTempList.stream().filter(e -> e.length() < 6).forEach(System.out::println);
        stringTempList.removeIf(str -> str.startsWith("h"));
        System.out.println("after delete");
        stringTempList.forEach(System.out::println);
    }
}
