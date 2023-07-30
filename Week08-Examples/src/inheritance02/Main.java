package inheritance02;

public class Main {

    public static void main(String[] args) {
        Dog labrador = new Dog("karabaş", 20, false);

        labrador.sayMyName();
        labrador.eat();
        String name = labrador.name;
        labrador.name = "karabai ";
        Dog kangal = new Dog("benekli", 5);

        labrador.sayMyName();
        kangal.sayMyName();

        Cat cat = new Cat("mirnav", 3);
        System.out.println("cat");
        cat.eat();
    }
}
