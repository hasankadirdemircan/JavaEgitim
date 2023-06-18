package for_loop;

import java.util.Scanner;

import java.util.Scanner;
public class ForLoopExample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int number = scanner.nextInt();
        int ciftSayac = 0;
        int tekSayac = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                ciftSayac++;
                System.out.println("sayi cift :" + i);
            }
            else {
                tekSayac++;
                System.out.println("sayi tek :" + i);
            }
        }

        System.out.println("1 den " + number + " a kadar toplam : " + ciftSayac + " tane çift sayı vardır.");
        System.out.println("1 den " + number + " a kadar toplam : " + tekSayac + " tane tek sayı vardır.");


    }
}
