package lambda_example03;

public class Lambda01 implements  LambdaFunctionWithMoreParameters{
    @Override
    public void plus(int number1, int number2) {
        System.out.println(number1 + number2);
    }
}
