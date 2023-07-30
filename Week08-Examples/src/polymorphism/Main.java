package polymorphism;

public class Main {
    public static void main(String[] args) {
        PolymorphismExample01 polymorphismExample01 = new PolymorphismExample01();
        polymorphismExample01.sum(5, 5);
        polymorphismExample01.sum(3.5, 5.0);
        polymorphismExample01.sum(1, 2, 3);
        polymorphismExample01.sum(5.0, 3);
    }
}
