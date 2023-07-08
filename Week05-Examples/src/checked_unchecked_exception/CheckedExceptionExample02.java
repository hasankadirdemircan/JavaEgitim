package checked_unchecked_exception;

public class CheckedExceptionExample02 {
    public static void main(String[] args) {
        String abc = null;
        try {
            abc.concat("a");
            System.out.println("işlem başarlı");
        }catch (NullPointerException exception) {
            System.out.println("catch NullPointerException");
            throw new RuntimeException(exception);
        }

        System.out.println("CheckedExceptionExample02 devam ediyor");
    }
}
