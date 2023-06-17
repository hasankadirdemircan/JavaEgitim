package errors;

public class StringImmutableExample01 {
    public static void main(String[] args) {
        //immutable test String
        String username = "java";
        String className = " dersi";
        System.out.println(username.concat(" dersi").concat(" basliyor."));
        username = username.concat(className);
        System.out.println(username);


    }
}
