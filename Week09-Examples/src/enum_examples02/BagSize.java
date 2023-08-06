package enum_examples02;


//Buradan sonrası farklı bir class

public enum BagSize {

    SHORT(15), MEDIUM(20), BIG(25);

    private int price;

    private BagSize(int price) {
        System.out.println("price : " + price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}