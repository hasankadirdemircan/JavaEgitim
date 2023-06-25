package methods;

public class ReturnTypeMethodExample01 {
    public static void main(String[] args) {
        int number1 = 5, number2 = 10;
        double toplam = toplaReturn(number1, number2);
        System.out.println(toplam);
        //toplaVoid(number1, number2);
       /* int toplam = number1 + number2;
        System.out.println("toplam: " + toplam);*/
    }

    static void toplaVoid(int number1, int number2) {
        int toplam = number1 + number2;
        System.out.println("toplam : " + toplam);
    }

    static int toplaReturn(int number1, int number2) {
        return number1 + number2;
    }
}
