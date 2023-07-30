package polymorphism04;

public class TestOverride {
    public static void main(String[] args) {
        System.out.println("animal");
        Animal animal = new Animal();
        animal.feetSize();
        System.out.println(animal.size);

        System.out.println("dogAnimal");
        Animal dogAnimal = new Dog();
        dogAnimal.feetSize();
        System.out.println(dogAnimal.size);
        System.out.println(dogAnimal.name);


        System.out.println("dog");
        Dog dog = new Dog();
        dog.feetSize();
        System.out.println(dog.size);
        dog.gender();

        System.out.println("terrierDog");
        Dog terrierDog = new Terrier();
        terrierDog.feetSize();
        System.out.println(terrierDog.size);
        terrierDog.gender();


    }
}
