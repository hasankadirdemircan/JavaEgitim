package polymorphism04;

public class Dog extends Animal{
    int size = 4;
    String name = "hava";

    @Override
    public void feetSize() {
        System.out.println("Dog feetSize");
    }

    public void gender() {
        System.out.println("male");
    }
}
