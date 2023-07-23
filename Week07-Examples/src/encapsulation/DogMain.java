package encapsulation;

public class DogMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getAge();
        System.out.println(dog.getAge());
        dog.setAge(10);
        System.out.println(dog.getAge());

        System.out.println(dog.getName());
        dog.setName("ciko");
        System.out.println(dog.getName());
    }
}
