package polymorphism02;

public class MainMathOperations {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        mathOperations.multipy(5.0, 5.0);
        mathOperations.multipy(2, 10.0);
        mathOperations.multipy(3, 4, 6);
        mathOperations.multipy(6, 8);

        mathOperations.multipy2(5.0, 6.0); //method adı farklı bu yüzden bu overloaded değildir.

        MathOperations mathOperations1 = new MathOperations();
        System.out.println(mathOperations1.hashCode());
    }
}
