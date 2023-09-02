package lambda_example03;

public class LambdaFunctionExample03 {
    public static void main(String[] args) {
        //Functional Interface'den önce <Java1.8
        LambdaFunctionWithMoreParameters oldLambda01 = new Lambda01();
        oldLambda01.plus(3, 5);

        System.out.println("Functional Interface");
        LambdaFunctionWithMoreParameters lambda01 = (number1, number2) -> System.out.println("plus is  :" +
                (number1 + number2));
        lambda01.plus(3, 5);
    }
}
