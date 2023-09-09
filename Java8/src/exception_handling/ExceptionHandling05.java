package exception_handling;

public class ExceptionHandling05 {
    public static void main(String[] args) {

        try (Computer2 computer = new Computer2()) {
            System.out.println("try block!!");
            int number = 1 / 0; //1.exception
        } catch (Exception e) {
            System.out.println("catch block!");
            System.out.println(e.getMessage());

            for(Throwable t : e.getSuppressed()){
                System.out.println(t.getMessage());
            }
        }
    }
}
class Computer2 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Shut down...");
        throw new IllegalStateException("Exception in close!"); //2.exception (suprressed)
    }
}
