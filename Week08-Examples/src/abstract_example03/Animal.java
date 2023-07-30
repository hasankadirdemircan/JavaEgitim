package abstract_example03;

public abstract class Animal {

    static int feetSize = 8;
    abstract void makeSound();

    public static void sayHello() {
        System.out.println("hello I'm a method in abstract class");
    }
    public void eat() {
        System.out.println("I can eat");
    }
}
