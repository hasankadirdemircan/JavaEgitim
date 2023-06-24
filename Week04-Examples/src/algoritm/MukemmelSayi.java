package algoritm;

public class MukemmelSayi {
    public static void main(String[] args) {
        /*
        Kendisi hariç bütün pozitif bölenlerinin toplamı, kendisine eşit olan sayılara mükemmel sayılar denir. Örneğin;

        6 sayısının bölenleri: 1 + 2 + 3 = 6

        28 sayısının bölenleri: 1 + 2 + 4 + 7 + 14 = 28

        Şimdi 1 ile 1000 arasındaki mükemmel sayıları bulacağız.
         */

       /* int sayi = 1;
        int toplam;
        while (sayi <= 1000) {
            toplam = 0;
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0)
                    toplam += i;
            }

            if (toplam == sayi)
                System.out.println(sayi + " mükemmel bir sayidir");

            sayi++;
        }
    }*/

        int toplam;
        for (int j = 1; j <= 1000; j++) {
            toplam = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    toplam += i;
                }
            }

            if (toplam == j) {
                System.out.println(j + " mükemmel bir sayidir");
            }
        }
    }
}


