package wrapper01;

public class AutoBoxing {

    public static void main(String[] args) {
        int number = 2;
        Integer integer = number; //auto boxing


        Integer integer2 = 5; //auto boxing
        int number2 = integer2; //auto unboxing

        //boxing
        Integer boxing = new Integer(100);
        Integer boxing2 = Integer.valueOf(100);

        //Auto unboxing
        Integer number3 = 100; //autoboxing
        int autoUnBoxing = number3;

        //Unboxing
        int unboxing = number3.intValue();

    }
}
