package exception_handling01;

public class ExceptionHandlingExample01 {
    public static void main(String[] args) {
        int number = 5;
        try {
            int result = number / 0;
            System.out.println("işlem başarlı");
        }catch (ArithmeticException exception) {
            System.out.println("catch ArithmeticException");
        }catch (NullPointerException exception) {
            System.out.println("catch NullPointerException");
        }catch (Exception exception) {
            System.out.println("catch. Exception");
        }

        System.out.println("işlem tamamlandı.");
    }
}
