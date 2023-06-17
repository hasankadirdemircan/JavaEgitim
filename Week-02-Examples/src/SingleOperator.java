public class SingleOperator {
    public static void main(String[] args) {
        // Değişken Tanımlaması:
        int number1 = 87;
        int number2 = 13;
        boolean condition = true;
        // Ön Arttırma ve Azalatma Operatörü:
        System.out.println("(number1) initialize Değeri: "+ number1 + "\t(++number1) Değeri: "+ (++number1));
        System.out.println("(number2) Değeri: "+ number2 +"\t(--number2) Değeri: "+(--number2));
        // Sonrası Artış ve Azaltma Operatörü
        System.out.println("(number1) Değeri: "+ number1 +"\t(number1--) Değeri: "+(number1--));
        System.out.println("(number2) Değeri: "+ number2 + "\t(number2++) Değeri: "+ (number2++));

        System.out.println("number1 : " + number1);
        System.out.println("number2 : " + number2);


        // Mantıksal Değil Operatörü:
        System.out.println("Değil (!): "+!condition);
    }
}