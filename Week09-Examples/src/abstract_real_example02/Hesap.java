package abstract_real_example02;

public abstract class Hesap {
    private String hesapNo;
    private double bakiye;

    public Hesap(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void paraYatir(double miktar) {
        bakiye = bakiye + miktar; // bakiye +=miktar;
    }

    public void paraCek(double miktar) {
        if (miktar <= getBakiye()) {
            paraYatir(-miktar); //setBakiye(getBakiye() - miktar);
            System.out.println(miktar + " TL çekildi");
        } else {
            System.out.println("Yetersiz bakiye");
        }
    }


    public String getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
