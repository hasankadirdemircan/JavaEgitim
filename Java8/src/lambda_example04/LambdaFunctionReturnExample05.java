package lambda_example04;

public class LambdaFunctionReturnExample05 {
    public static void main(String[] args) {
        LambdaCalculator lambda01 = (number1, number2) -> {
            return number1 - number2;
        };
       // LambdaCalculator lambda02 = number1, number2 -> number1 - number2; compile error çünkü () 'ler yok. 1 den fazla veya hgiç parametre almıyorsa () zorunlu.
        LambdaCalculator lambda03 = (int number1, int number2) -> number1 - number2;
        LambdaCalculator lambda04 = (int number1, int number2) -> number1 * number2;
        LambdaCalculator lambda05 = (int number1, int number2) -> number1 + number2;

        int sumResult = lambda05.process(3, 5);
        System.out.println(sumResult);

        int multipyResult = lambda04.process(3, 5);
        System.out.println(multipyResult);

    }
}
