package wrapper01;

public class WrapperExample01 {
    public static void main(String[] args) {
        int number = 0;
        Integer integer = null;

        Boolean bool = new Boolean("true");
        //  boolean tf = 1; //error
        if (bool = true) {
            System.out.println("bool is true");
        }
        System.out.println("number default value : " + number);
        System.out.println("integer default value : " + integer);


        Integer integer1 = Integer.valueOf("7");
        Integer integer2 = Integer.valueOf("20");

        if(integer1 < integer2) {
            System.out.println("integer2 büyük");
        }

        System.out.println(integer1.compareTo(integer2));
    }
}
