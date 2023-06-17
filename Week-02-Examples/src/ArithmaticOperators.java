public class ArithmaticOperators {
    public static void main(String[] args) {
        // Değişken Tanımlaması:
        int number1 = 25, number2 = 3, number3 = 17;
        String websiteName = "Web Sitemiz: ";
        String websiteUri = "www.bilgeadam.com.tr";

        // Stringlerde Ekleme Operatörünü Kullanırsak:
        System.out.println("Merhaba!\n" + (websiteName + websiteUri));
        int sum = number1 + number2;
        System.out.println("number1 + number2 : " + sum + " dir");

        // Ekleme ve Çıkarma Operatörleri:
        System.out.println("number1 + number2 = " + sum);
        int minus = number1 - number3;
        System.out.println("number1 - number3 = " + minus);

        // Çarpma ve Bölme Operatörleri:
        int multipy = (number1 * number2);
        System.out.println("number1 * number2 = " + multipy);

        int divide = number1 / 5;
        System.out.println("number1 / 5 = " + divide);

        // Mod Alma Operatörü:
        int mod = number3 % number2;
        System.out.println("number3 % number2 = " + (mod));
    }
}
