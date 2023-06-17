public class SingleOperator02 {
    public static void main(String[] args) {
        //Değişken Tanımlaması:
        int number1 = 87;
        int number2 = 13;

        boolean condition = true;
        //Ön Arttırma ve Azaltma Operatörü:
        System.out.println("(number1) Initialize Değeri: "+ number1 + "\t(++number1) Değeri: " + (++number1));
        System.out.println("(number2) Initialize Değeri: "+ number2 + "\t(--number2) Değeri: " + (--number2));
        //Sonrası Artış ve Azaltma Operatörü:
        System.out.println("(number1) Değeri: " + number1 + "\t(number1--) Değeri: " + (number1--));
        System.out.println("(number2) Değeri: " + number2 + "\t(number2++) Değeri: " + (number2++));

        System.out.println("number1 : " + number1);

        System.out.println("number2: " + number2);
    }
}