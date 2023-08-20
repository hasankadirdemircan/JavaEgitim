package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsClassExample01 {
    public static void main(String[] args) {
        GenericClass<Integer> intObject = new GenericClass<>(5, 10);
        System.out.println(intObject.getData());

        GenericClass<String> stringObj = new GenericClass<>("Java Programming", "hello");
        System.out.println(stringObj.getData());

        List<Object> list = new ArrayList<>();

        User user  = new User("name1", 23);
        list.add("sdsad");
        list.add(1);
        list.add(10.5);
        list.add(user);

    }
}
