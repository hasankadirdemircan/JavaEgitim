package list_examples01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("C#");
        names.add("Python");

        System.out.println("List before Set: " + names);
        names.set(1, "Scala");

        System.out.println("List after Set: " + names);

    }
}
