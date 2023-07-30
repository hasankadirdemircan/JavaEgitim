package abstract_example03;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();

        Animal.sayHello();
        System.out.println(Animal.feetSize);
    }
}
