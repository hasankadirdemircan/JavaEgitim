package factory_design_pattern;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Bmw bmw = (Bmw) CarFactory.createCar(Bmw.class);
        bmw.name();
        bmw.price(5000000);

        Porshe porshe = (Porshe) CarFactory.createCar(Porshe.class);
        porshe.name();
        porshe.price(2020302302);
    }
}
