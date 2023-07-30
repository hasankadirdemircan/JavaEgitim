package inheritance_homework01;

public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public double calculateArea() {
        return 0.0;
    }
}
