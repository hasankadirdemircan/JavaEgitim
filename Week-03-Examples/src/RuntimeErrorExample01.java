public class RuntimeErrorExample01 {
    public static void main(String[] args) {
        int number1 = 5;
      //  System.out.println(5/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero

    try {// hata gelebilecegini düsündügümüz kod satirlari
        System.out.println(5/0);
    } catch (ArithmeticException ex) {
        System.out.println("bir hata ile karsilasildi. hata -> " + ex.getMessage());
    }
        System.out.println("islem devam ediyor");
    }
}
