import java.util.Scanner;

public class Algorithm05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c = commaNumberToDouble(scanner.nextLine());
        System.out.println("double : " + c);
       /* if(number1 < number2) {
            System.out.println("küçük olan number1'dir : " + number1);
            System.out.println("büyük olan number2 : " + number2);
        } else if (number2 < number1) {
            System.out.println("küçük olan number2: " + number2);
            System.out.println("büyük olan number1: " + number1);
        }else {
            System.out.println("iki sayı eşittir.");
        }*/

       /* int maxNumber = Math.max(number1, number2);
        int minNumber = Math.min(number1, number2);
        System.out.println("min : " + minNumber);
        System.out.println("max : " + maxNumber);

*/
    }
    private static double commaNumberToDouble(String input) {

        return Double.parseDouble(input);
    }
}
