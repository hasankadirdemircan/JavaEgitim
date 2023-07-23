package constructor;

public class ConstructorOverloadingClass {
    String name;
    String address;
    String email;
    int age;

    int weight;

    ConstructorOverloadingClass() {
        System.out.println("no-arg constructor");
    }

    ConstructorOverloadingClass(int age, String email) {
        System.out.println("age and email constructor");
        this.age = age;
        this.email = email;
    }

    public ConstructorOverloadingClass(int age) {
        this.age = age;
    }

    public ConstructorOverloadingClass(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ConstructorOverloadingClass(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void sayHello() {
        System.out.println("hellooo");
    }
}
