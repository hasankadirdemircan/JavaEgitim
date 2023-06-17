import java.util.Scanner;

public class Algorithm03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        int number1 = scanner.nextInt();
        if(number1 ==0){
            System.out.println("number1  sıfırdan farklı girilmelidir");
            System.exit(0);
        }
        System.out.println("İkinci sayıyı giriniz : ");
        int number2 = scanner.nextInt();

        if(number1 !=0 && number2 !=0){
            //int sum = number1 + number2;
            System.out.println("Girilen sıfırdan farklı iki sayının toplamı : " +  (number1 + number2));
        } else {
            System.out.println("Girilen sayılardan en az 1 tanesi sıfırdı. Bu yüzden işlem devam edemeyecektir.");
            System.exit(0);
        }

        System.out.println("İşlemler devam ediyor....");
    }
}
