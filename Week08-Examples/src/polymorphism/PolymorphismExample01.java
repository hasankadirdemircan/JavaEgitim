package polymorphism;

public class PolymorphismExample01 {

    public int sum(int number1, int number2) {
        System.out.println("int sum() -> 2 params");
        return number1 + number2;
    }


    public int sum(int number1, int number2, int number3) {
        System.out.println("int sum() -> 3 params");
        return number1 + number2 + number3;
    }


    public double sum(double number1, double number2) {
        System.out.println("double sum() -> 2 params");

        return number1 + number2;
    }


}
