// Abstract Bitki sınıfı
abstract class Bitki {
    private String tur;
    private boolean sulanmis;
    private boolean gubrelenmis;

    public Bitki(String tur) {
        this.tur = tur;
        this.sulanmis = false;
        this.gubrelenmis = false;
    }

    public String getTur() {
        return tur;
    }

    public boolean isSulanmis() {
        return sulanmis;
    }

    public boolean isGubrelenmis() {
        return gubrelenmis;
    }

    public void sulama() {
        if (!sulanmis) {
            System.out.println(tur + " sulandı.");
            sulanmis = true;
        } else {
            System.out.println(tur + " zaten sulandı.");
        }
    }

    public void gubreleme() {
        if (!gubrelenmis) {
            System.out.println(tur + " gübrelendi.");
            gubrelenmis = true;
        } else {
            System.out.println(tur + " zaten gübrelendi.");
        }
    }

    // Soyut metot, alt sınıflar tarafından nasıl bakım yapılacağı uygulanacak
    public abstract void bakimYap();

    // Bakım durumu gösteren metot
    public void bakimDurumu() {
        System.out.println(tur + " bitkisinin bakım durumu: sulanmış=" + sulanmis + ", gübrelenmiş=" + gubrelenmis);
    }
}

// Cicek sınıfı
class Cicek extends Bitki {
    public Cicek(String tur) {
        super(tur);
    }

    @Override
    public void bakimYap() {
        System.out.println(getTur() + " bitkisi için çiçek açtırma işlemi yapıldı!");
    }
}

// Agac sınıfı
class Agac extends Bitki {
    public Agac(String tur) {
        super(tur);
    }

    @Override
    public void bakimYap() {
        System.out.println(getTur() + " bitkisi için budama işlemi yapıldı!");
    }
}

// Ana program
public class CevreDuzenlemeProgrami {
    public static void main(String[] args) {
        Bitki cicek = new Cicek("Gülyağı");
        Bitki agac = new Agac("Selvi");

        cicek.sulama();
        cicek.gubreleme();
        cicek.bakimDurumu();
        cicek.bakimYap();

        agac.sulama();
        agac.gubreleme();
        agac.bakimDurumu();
        agac.bakimYap();
    }
}
