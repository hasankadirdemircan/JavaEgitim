package access_specifier;

import access_specifier_examp.ArithmeticOperation;

import java.util.Random;

public class Main {
    /*
    - bir tane Main adında classım olsun. Bu class farklı bir pakette bulunan
    ve adı ArithmeticOperation class'ın sum() methodunu new ile çağırsın
    ve 2 sayıyı toplayıp geri dönsün.
    - Main class'ım içerisinde bir divide methodum olsun bu method 2 sayıyı alıp bölüp sonucu bu method içerisinde yazdırsın.
    - Main classında bir tane helloWorld adında methodum olsun ve ekrana helloWorld yazsın.
    Bu classa başka paket ve classlardan
    new ile üretmeden çağrılabilsin.
     */
    public static void main(String[] args) {
        Random random = new Random();
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        System.out.println( arithmeticOperation.sum(3, 5));
        divide(3,5);
        helloWorld();
    }

    private static void divide(int number1, int number2) {
        System.out.println( (double) number1 / number2);
    }

    public static void helloWorld() {
        System.out.println("hello world!");
    }
}
