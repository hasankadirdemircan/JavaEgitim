package for_loop;

import java.util.Scanner;

public class ForLoopAlgorithmExample01 {
    //iki sayı gir teklerin toplamını ve ortalamasını al ekrana yaz. aynı işi çift içinde yap. girilen sayılar dahil olsun
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("İki sayı giriniz");
        System.out.println("Birinci sayı: ");
        int number1=scanner.nextInt();
        System.out.println("İkinci sayı: ");
        int number2=scanner.nextInt();
        int numberMin=Math.min(number1,number2);
        int numberMax=Math.max(number1,number2);
        int oddSum=0;
        int evenSum=0;
        int evenCount=0;
        int oddCount=0;

        if (number1==number2){
            System.out.println("Girilen sayılar birbirine eşit olamaz. Programı tekrar çalıştırınız.");
        }else {
            for (int i = numberMin; i <= numberMax; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                    evenCount++;
                } else {
                    oddSum += i;
                    oddCount++;
                }
            }
            System.out.println("Çift sayıların toplamı: " + evenSum + "\nÇift sayıların ortalaması: " + (double) evenSum / evenCount);
            System.out.println("Tek sayıların toplamı: " + oddSum + "\nTek sayıların ortalaması: " + (double) oddSum / oddCount);
        }
    }
}