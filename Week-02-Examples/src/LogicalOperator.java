public class LogicalOperator {
    public static void main(String[] args) {
        String username="hasankadirdemircan";
        int password=1423456;
        int age = 17;
        boolean isStudent = true;



        System.out.println(username.equals("hasankadirdemircan"));
        System.out.println(username.equals("hasankadir"));
        System.out.println(password == 123456);
        System.out.println(password == 0123456);

        // Koşullar yapısını anlatırken if-else kavramına daha detaylı değineceğiz.
        if(username.equals("hasankadirdemircan") && password==123456 && ( (age >=18 && age <= 25) || isStudent == true)) {
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Giriş Başarısız");
        }


        System.out.println("Bye Bye");
    }
}