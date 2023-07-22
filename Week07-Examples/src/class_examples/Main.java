package class_examples;

public class Main {
    public static void main(String[] args) {

        System.out.println("my dog");
        Dog myDog = new Dog(); //myDog -> dog objesidir.
        myDog.age = 10;
        myDog.color = "blue";
        myDog.isHealthy = true;
        myDog.findAge();
        System.out.println("is my dog healthy? : " + myDog.isHealthy );

        System.out.println("dad's dog");
        Dog dadsDog = new Dog();
        dadsDog.findAge();
        System.out.println("is dad's dog healthy? : " + dadsDog.isHealthy );

    }
}