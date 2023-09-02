package lambda_example06;

@FunctionalInterface
interface LambdaFinal{
    void printMessage(String msg);
}

public class LambdaFunctionExample06 {

    public static void main(String[] args) {

        String value1 = "hello";
        String value2 = "java";
        final String value3 = "world";
        LambdaFinal lambda01 = message -> {
           // value2 = "asdasdad";
            message = "asdasd";
            System.out.println(message + ". " + value1 + " "+ value2 + " " + value3);
        };
        // value2 = "java8";
        // burada value2 ' ye tekrar deger set etmek istersek,
        // compile error verir, value2'ye lambda içerisinde değer atamak legal degildir.
        // effectively final degildir.

        //ama message 'e değer atabilirim yani set edebilirim çünkü message değeri lambda'ya ait.

        lambda01.printMessage("hello");
    }
}
