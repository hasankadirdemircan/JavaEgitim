package factory_design_pattern;

public class Porshe implements Car {
    @Override
    public void name() {
        System.out.println("Car name is : Porshe");
    }

    @Override
    public void price(int price) {
        System.out.println("Porshe price is : " + price);
    }
}
