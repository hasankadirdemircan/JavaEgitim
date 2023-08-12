package linked_list_example;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample01 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("java");
        names.add("c#");
        names.add("python");

        names.indexOf("python");
        LinkedList<String> names1 = new LinkedList<>();

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        List<String> names2 = new LinkedList<>();
        ((LinkedList<String>) names2).addFirst("bilge");
        names1.addFirst("bilge");

        System.out.println(names);
        System.out.println(names.getFirst());
        names.removeLast();
        System.out.println(names);

    }
}
