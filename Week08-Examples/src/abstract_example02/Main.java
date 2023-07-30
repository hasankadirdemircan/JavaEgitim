package abstract_example02;

public class Main {
    public static void main(String[] args) {
        // Sekil sınıfından nesne oluşturulamaz (soyut bir sınıf olduğu için).
       // Shape shape = new Shape();
        System.out.println("---Rectangle---");
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle.calculateArea());
        rectangle.draw();

        System.out.println("---Circle---");
        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());
        circle.draw();

        System.out.println("---Triangle---");
        Triangle triangle = new Triangle(4, 8);
        System.out.println(triangle.calculateArea());
        triangle.draw();
    }
}
