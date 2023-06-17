public class StringEqualsExample01 {
    public static void main(String[] args) {
        String username1 = "name1";
        String username2 = "name1";

        boolean isEquals = username1 == username2;
        boolean isEquals2 = username1.equals(username2);

        System.out.println(isEquals);
        System.out.println(isEquals2);
    }
}
