public class CompileErrorExample01 {
    public static void main(String[] args) {
        int number = 5;
        //int number = 10; derleme hata

        System.out.println("number ilk : "  + number);
        int number2 = 5;
        number = 10;
        System.out.println("number son : "  + number);


        int number3;
       // int sum = number + number3; //Variable 'number3' might not have been initialized

        //System.out.println(number3); //Variable 'number3' might not have been initialized

        int x = 10;
        int y = 5;
       // String multipy = x * y; type mismatch hata



    }

    public static int concatMethod() {
        int number10 = 25;
        if(number10 < 10){
            return 2;
        }else {
            return 5;
        }
      //  System.out.println("merhaba"); //Unreachable statement
    }
}
