package abstract_real_example02;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Musteri {
    private String ad;
    private String hesapNo;
    private List<Hesap> hesaplar; //List ve Arraylist kullanılmalı. -> Collection

    public Musteri(String ad, String hesapNo) {
        this.ad = ad;
        this.hesapNo = hesapNo;
        this.hesaplar = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public String getHesapNo() {
        return hesapNo;
    }


    public List<Hesap> getHesaplar() {
        return hesaplar;
    }

    public void paraYatir(String hesapNo, double miktar) {
        Hesap hesap = hesapBul(hesapNo);
        if (hesap != null) {
            hesap.paraYatir(miktar);
        } else {
            System.out.println("hesap bulunamadı");
        }
    }

    public void paraCek(String hesapNo, double miktar) {
        Hesap hesap = hesapBul(hesapNo);
        if (hesap != null) {
            hesap.paraCek(miktar);
        } else {
            System.out.println("hesap bulunamadı");
        }
    }

    public void bakiyeSorgula(String hesapNo) {
        Hesap hesap = hesapBul(hesapNo);
        if (hesap != null) {
            System.out.println("Hesap No : " + hesap.getHesapNo() + " Bakiye : " + hesap.getBakiye());
        } else {
            System.out.println("Hesap bulunamadı");
        }

    }

    public void hesapEkle(Hesap hesap) {
        //hesaplar.get(0);
        hesaplar.add(hesap);
    }

    //hesabını bul , BirikimHesap.java veya VadesizHesap.java
    public Hesap hesapBul(String hesapNo) {
        for (Hesap hesap : hesaplar) {
            if (hesap.getHesapNo().equals(hesapNo)) {
                //BirikimHesap b = (BirikimHesap) hesap;
                return hesap;
            }
        }
        return null;
    }
}
