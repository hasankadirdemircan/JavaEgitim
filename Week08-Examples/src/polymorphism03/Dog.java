package polymorphism03;

public class Dog extends Animal {

    @Override
    void sound() { //override ettiğimiz methodun parametresi/ parametre sayısı
        // parametrenin veri tipi / methodun dönüş tipi değiştirelemez.
        System.out.println("Dog barks");
    }

}
