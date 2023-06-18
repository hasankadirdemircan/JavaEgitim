package algorithm;

import java.util.Scanner;

public class TekCift2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("girilen " + number + " sayisi çifttir.");
        }else {
            System.out.println("girilen " + number + " sayisi tektir.");
        }
    }
}
