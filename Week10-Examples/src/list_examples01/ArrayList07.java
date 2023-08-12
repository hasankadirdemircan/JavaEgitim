package list_examples01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList07 {

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("Java");
        firstList.add("Python");

        List<String> secondList = new ArrayList<>();
        secondList.add("Scala");
        secondList.add("Kotlin");

        LinkedList<String> thirdList  = new LinkedList<>();
        thirdList.add("ReactJS");

        firstList.addAll(secondList);
        firstList.addAll(thirdList);
        System.out.println(firstList);

        System.out.println(firstList.contains("Java"));
        System.out.println(firstList.contains("abc"));
    }
}
