package list_examples01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "C#", "Python");

        names.replaceAll(String::toUpperCase);
        System.out.println(names);

        for(String name: names) {
            names.set(names.indexOf(name), name.toUpperCase());
        }
        System.out.println(names);
    }
}
