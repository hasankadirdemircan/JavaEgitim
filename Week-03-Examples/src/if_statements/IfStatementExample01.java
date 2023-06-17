package if_statements;

public class IfStatementExample01 {
    public static void main(String[] args) {
       /* structure
        boolean statement = condition -> true / false
        if(statement) {
            // code-block
        }*/
        /*int number1 = 5, number2 = 10;
        boolean statement = number1 < number2;
        if(statement)
        System.out.println("number1 kucuktur number2'den");
        System.out.println("number1 buyuk giriniz");
        */
        int number1 = 15, number2 = 10;
        boolean statement = number1 < number2;
        if(statement) {
            System.out.println("number1 kucuktur number2'den");
        }
        System.out.println("number1 buyuk giriniz");

    }
}
