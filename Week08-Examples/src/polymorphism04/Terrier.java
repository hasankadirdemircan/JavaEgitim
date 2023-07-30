package polymorphism04;

public class Terrier extends Dog {

    int size = 2;

    @Override
    public void feetSize() {
        System.out.println("Terrier feetSize");
    }

    @Override
    public void gender() {
        System.out.println("female");
    }
}
