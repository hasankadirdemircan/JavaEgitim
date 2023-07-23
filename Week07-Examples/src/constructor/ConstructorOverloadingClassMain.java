package constructor;

public class ConstructorOverloadingClassMain {

    public static void main(String[] args) {
      //  ConstructorOverloadingClass object1 = new ConstructorOverloadingClass();

        ConstructorOverloadingClass object2 = new ConstructorOverloadingClass(20,"gmail");

        System.out.println(object2.email);
        System.out.println(object2.address);
        System.out.println(object2.weight);
        System.out.println();
        object2.sayHello();


        ConstructorOverloadingClass object3 = new ConstructorOverloadingClass("bilgeadam","gmail");
        ConstructorOverloadingClass object4 = new ConstructorOverloadingClass();

        object4.sayHello();

    }
}
