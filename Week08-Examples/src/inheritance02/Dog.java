package inheritance02;

public class Dog extends Animal{
    boolean isBite;
    String type;

    public Dog(String name, int age, boolean isBite) {
        super(name, age);
        this.isBite = isBite;
    }
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I'm Dog. I can eat pizza");
    }

    public void sayMyName() {
        System.out.println("My name is : " + name);
    }

    public void bark() {
        System.out.println("I can bark");
    }
}
