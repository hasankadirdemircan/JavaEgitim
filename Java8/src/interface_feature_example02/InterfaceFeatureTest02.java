package interface_feature_example02;


interface Animal{
    public default void eat(){
        System.out.println("eating..");
    }

    public default void run(){
        System.out.println("running..");
    }

    public static void breathe(){
        System.out.println("breathing..");
    }
}

class Dog implements Animal{
    // interface'lerde yer alan default methodlari override edebiliriz.

    @Override
    public void run() {
        System.out.println("Dog running..");
    }
}
public class InterfaceFeatureTest02 {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.run();

        Animal.breathe(); // interface'de bulunan static methodlari cagirabiliyoruz.(interfaceAdi.staticMethodAdi).
        // Dog.run(); // legal degildir.
        // Dog.breathe(); // legal degildir.

        // interface'lerdeki static methodlari sadece,
        // interfaceAdi.staticMethodAdi seklinde cagirabiliriz.
        // bu method'lari degiskenler uzerinden cagiramiyoruz.
        // ama bunlari class yapisinda methodlara degiskenler uzerinden ulasabilecegimizi unutmayalim.

        // Asagidaki Super ve Sub class ornekleriyle aciklayabiliriz.
        Super.message();
        Sub.message();
        Sub sub = new Sub();
        sub.message();
    }

}

class Super{
    public static void message(){
        System.out.println("hello static method in class");
    }
}

class Sub extends Super{

}