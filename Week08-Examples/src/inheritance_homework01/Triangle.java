package inheritance_homework01;

public class Triangle extends Shape{
    double base;

    double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
