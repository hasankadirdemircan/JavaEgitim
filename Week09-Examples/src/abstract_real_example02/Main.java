package abstract_real_example02;

import interface03.B;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Sen bir banka yazılım geliştiricisisin ve müşterilerin banka hesaplarını yöneten bir sistem geliştiriyorsun.
Bankanın müşterileri bireyler ve şirketlerdir. Her müşteri için farklı türde hesaplar
(örneğin vadesiz hesap, birikim hesabı, kredi hesabı) açılabilir.
Bireyler ve şirketler için ortak bazı işlemler de vardır, ancak hesap türlerine göre farklı işlemler de gerçekleşir.

Bu senaryoya uygun olarak, Java dilinde bir sınıf yapısı oluşturarak müşterilerin banka hesaplarını yönetmek için
 kullanabileceğin bir taslağı göstermeni istiyorum.
 Bu sınıflarda müşterilerin hesaplarına para yatırma, para çekme ve bakiye sorgulama gibi temel işlemleri de
 gerçekleştirmen gerekmektedir.
 */
public class Main {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("Ali", "123456");
        Musteri musteri2 = new Musteri("Ayse", "789012");

        VadesizHesap vadesizHesap1 = new VadesizHesap("987654");
        VadesizHesap vadesizHesap2 = new VadesizHesap("354564");
        BirikimHesap birikimHesap1 = new BirikimHesap("456789", 0.05);
        BirikimHesap birikimHesap2 = new BirikimHesap("1314141", 0.06);

        musteri1.hesapEkle(vadesizHesap1);
        musteri1.hesapEkle(vadesizHesap2);
        musteri1.hesapEkle(birikimHesap2);
        musteri1.paraYatir("987654", 100);
        musteri1.paraYatir("354564", 150);
        musteri1.paraYatir("1314141", 200);
        musteri1.paraCek("987654", 20);
        musteri1.bakiyeSorgula("987654");
        birikimHesap2.faizEkle();


        musteri2.hesapEkle(birikimHesap1);

        musteri2.paraYatir("456789", 1000);
        musteri2.paraCek("456789", 200);
        musteri2.bakiyeSorgula("456789");

        birikimHesap1.faizEkle();
        musteri2.bakiyeSorgula("456789");

    }


}
