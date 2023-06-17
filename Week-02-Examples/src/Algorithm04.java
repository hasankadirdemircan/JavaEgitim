import java.util.Scanner;

public class Algorithm04 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        double sayi1,sayi2,sayi3;
        System.out.println("Lütfen sayıyı giriniz:");
        sayi1=giris.nextDouble();
        sayi2=Math.ceil(sayi1);
        sayi3=Math.floor(sayi1);
        System.out.println("Yukarı yuvarlama="+sayi2);
        System.out.println("Aşağı yuvarlama="+sayi3);
        Math.abs(-2);
    }
}
