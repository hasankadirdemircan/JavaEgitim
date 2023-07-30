package inheritance03;





class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();

        // access protected field and method
        // using the object of subclass
        labrador.name = "Rocky";
        labrador.display();

        labrador.getInfo();

        Animal animal = new Animal();
        animal.name = "key";
        animal.display();
    }

}