package lambda_example04;

@FunctionalInterface
public interface LambdaCalculator {
    /*
    int number1
    int number2  bu ikisi bu fonksiyon çağrıldığında parametre olarak gelecek.
     */
    int process(int number1, int number2); //bu artık functional interface çünkü en az ve en fazla 1 adet abstract methoduym var.
//int geri dönüş tipini belirtir yani buradan bir int tipinde sonuç dönecek.
}
