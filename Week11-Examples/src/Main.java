import java.util.*;

public class Main {
    public static void main(String[] args) {
        //GENEL TEKRAR
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Amasya");
        sehirler.add("Sivas");
        sehirler.add("İzmir");
        sehirler.add("Eskişehir");

        // Tekrarlı element ekliyoruz.
        sehirler.add("Amasya");

        // İstediğimiz index'e eleman ekliyoruz.
        sehirler.add(3, "Isparta");

        System.out.print("ArrayList -> ");
        sehirler.forEach(sehir -> System.out.print(sehir + " "));

        User user1 = new User("name1", 22);
        User user2 = new User("name2", 23);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Map<Integer, List<User>> userListMap = new HashMap<>();
        userListMap.put(1, userList);
        userListMap.put(2, userList);

        Set<List<User>> userListSet = new HashSet<>();
        userListSet.add(userList);
        System.out.println();
    }
}