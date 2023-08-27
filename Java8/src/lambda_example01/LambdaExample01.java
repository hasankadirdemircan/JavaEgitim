package lambda_example01;

public class LambdaExample01 {

    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("hello world");
        lambdaFunction.message();
    }
}
