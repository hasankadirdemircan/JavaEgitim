package inheritance_homework01;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5.0);
        Rectangle rectangle = new Rectangle("green", 3.0, 8.0);
        Triangle triangle = new Triangle("blue", 4.0, 8.0);

        circle.draw();
        System.out.println("Circle Area : " + circle.calculateArea());

        rectangle.draw();
        System.out.println("Rectangle Area : " + rectangle.calculateArea());

        triangle.draw();
        System.out.println("Triangle Area : " + triangle.calculateArea());
    }
}
