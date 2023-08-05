import java.io.*;

// Abstract oyuncu sınıfı
abstract class Oyuncu implements Serializable {
    private String ad;
    private int yas;
    private int puan;

    public Oyuncu(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
        this.puan = 0;
    }

    public String getAd() {
        return ad;
    }

    public int getYas() {
        return yas;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    // Dosyaya oyuncu verilerini kaydeden metot
    public void kaydet(String dosyaAdi) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dosyaAdi))) {
            oos.writeObject(this);
            System.out.println("Oyuncu verileri dosyaya kaydedildi: " + dosyaAdi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Dosyadan oyuncu verilerini yükleyen metot
    public static Oyuncu yukle(String dosyaAdi) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dosyaAdi))) {
            Oyuncu oyuncu = (Oyuncu) ois.readObject();
            System.out.println("Oyuncu verileri dosyadan yüklendi: " + dosyaAdi);
            return oyuncu;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Soyut metot, oyunlarda nasıl puan alacaklarını alt sınıflar uygulayacak
    public abstract void oyunOyna();
}

// Futbolcu sınıfı
class Futbolcu extends Oyuncu {
    private String mevki;

    public Futbolcu(String ad, int yas, String mevki) {
        super(ad, yas);
        this.mevki = mevki;
    }

    public String getMevki() {
        return mevki;
    }

    @Override
    public void oyunOyna() {
        System.out.println(getAd() + " futbol oynadı ve 1 puan kazandı!");
        setPuan(getPuan() + 1);
    }
}

// Basketbolcu sınıfı
class Basketbolcu extends Oyuncu {
    private double boy;

    public Basketbolcu(String ad, int yas, double boy) {
        super(ad, yas);
        this.boy = boy;
    }

    public double getBoy() {
        return boy;
    }

    @Override
    public void oyunOyna() {
        System.out.println(getAd() + " basketbol oynadı ve 2 puan kazandı!");
        setPuan(getPuan() + 2);
    }
}

// Ana program
public class OyuncuVeritabaniYonetimSistemi {
    public static void main(String[] args) {
        Futbolcu futbolcu1 = new Futbolcu("Ahmet", 25, "Forvet");
        Basketbolcu basketbolcu1 = new Basketbolcu("Mehmet", 30, 2.05);

        futbolcu1.oyunOyna();
        futbolcu1.oyunOyna();
        basketbolcu1.oyunOyna();

        futbolcu1.kaydet("futbolcu1.dat");
        basketbolcu1.kaydet("basketbolcu1.dat");

        Futbolcu futbolcu1Yuklu = (Futbolcu) Oyuncu.yukle("futbolcu1.dat");
        Basketbolcu basketbolcu1Yuklu = (Basketbolcu) Oyuncu.yukle("basketbolcu1.dat");

        System.out.println("Futbolcu1 yüklenen puan: " + futbolcu1Yuklu.getPuan());
        System.out.println("Basketbolcu1 yüklenen puan: " + basketbolcu1Yuklu.getPuan());
    }
}
