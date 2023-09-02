package lambda_example05;
public class LambdaFunctionIfExample {

    public static void main(String[] args) {
        LambdaFunctionV2 lambda01 =
                (int number) -> {
                    if( number % 2 == 0) return "even";
                    else return "odd";

                };

        LambdaFunctionV2 lambda02 = (int number) -> {
            if(number % 2 == 0){
                return "even";
            }
            else{
                return "odd";
            }
        };

        String result = lambda01.intKind(5);
        System.out.println(result);
        System.out.println(lambda02.intKind(4));
    }
}
