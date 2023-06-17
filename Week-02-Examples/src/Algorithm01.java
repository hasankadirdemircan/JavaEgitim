import java.util.Scanner;

public class Algorithm01 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int number1, number2, sum;
        int multipy;
        int result;
        System.out.println("Birinci sayıyı giriniz:");
        number1 = entry.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        number2 = entry.nextInt();
        result = number1 + number2;
        System.out.println("number1 + number2 = " + (number1 + number2));
        System.out.println("number1 + number2 = " + result);
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");

    }
}
