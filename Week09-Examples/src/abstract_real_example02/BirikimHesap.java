package abstract_real_example02;

public class BirikimHesap extends Hesap{
    private double faizOrani;
    public BirikimHesap(String hesapNo, double faizOrani) {
        super(hesapNo);
        this.faizOrani = faizOrani;
    }

    public void faizEkle() {
        double faizMiktar = getBakiye() * faizOrani;
        paraYatir(faizMiktar);
        System.out.println("Faiz eklendi : " + faizMiktar + " TL");
    }
}
