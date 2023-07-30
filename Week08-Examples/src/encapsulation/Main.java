package encapsulation;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(20);
        user.setUsername("bilgeadam");
        System.out.println(user.getAge());
        System.out.println(user.getUsername());
    }
}