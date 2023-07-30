package abstract_example03;

public abstract class Animal {
    public Animal() {
        System.out.println("I am Animal no-arg constructor");
    }

    static int feetSize = 8;
    abstract void makeSound();

    public static void sayHello() {
        System.out.println("hello I'm a method in abstract class");
    }
    public void eat() {
        System.out.println("I can eat");
    }
}
