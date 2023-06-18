package algorithm;

import java.util.Scanner;

public class NoteCalculate {
    public static void main(String[] args) {
        /*
        kullanici vize ve final notunu girsin
vizenin %40 i, final in %60 i alinsin.
sonuc 45 den kucukse FF. 45 buyuk esit ve 60'dan küçük ise CC
60'a büyük eşit ve 70 den küçükkse BB
70 büyük eşit ve 90'dan küçükse  BA
90 büyük eşit se AA
bulan program
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("vize notunu giriniz: ");
        int vizeNote = scanner.nextInt();
       // float test = (float) (vizeNote * 0.4);
        System.out.println("final notunu giriniz: ");
        int finalNote = scanner.nextInt();

        if(vizeNote > 100 || finalNote > 100) {
            System.out.println("vize veya final notunu yanlış girdiniz. lütfen tekrar deneyiniz.");
            System.exit(-1);
        }
        float resultNote = (float) ((vizeNote * 0.4) + (finalNote * 0.6));
        System.out.println("not ortalamanız : " + resultNote);
        if(resultNote < 45) {
            System.out.println("notunuz FF' dir.");
        }else if (resultNote >= 45 && resultNote < 60) {
            System.out.println("notunuz CC' dir.");
        }else if (resultNote >= 60 && resultNote < 70) {
            System.out.println("notunuz BB' dir.");
        }else if (resultNote >= 70 && resultNote < 90) {
            System.out.println("notunuz BA' dir.");
        }else {
            System.out.println("notunuz AA' dir.");
        }
    }
}
