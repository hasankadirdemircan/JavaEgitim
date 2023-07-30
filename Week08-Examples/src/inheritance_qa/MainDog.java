package inheritance_qa;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("abc", 2);
        Dog dog2 = new Dog(10, 2);

        Dog dog3 = new Dog(2000, "labrador");
        Dog dog4 = new Dog("labrador", 2000);
      //  Dog dog3 = new Dog(3 ,4, "dsf");
    }
}
