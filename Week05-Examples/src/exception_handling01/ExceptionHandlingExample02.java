package exception_handling01;

public class ExceptionHandlingExample02 {
    public static void main(String[] args) {
        String abc = null;
        try {
             abc.concat("a");
            System.out.println("işlem başarlı");
        }finally {
            System.out.println("finally");
        }


        System.out.println("işlem tamamlandı.");


    }
}
