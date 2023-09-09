package exception_handling;

import java.io.IOException;

public class ExceptionHandling04 {
    public static void main(String[] args) {
        try (Computer computer = new Computer()) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Computer implements AutoCloseable {
    @Override
    public void close() throws IOException{
        // for override methods , we can't add a new checked exception.
        // we can add an exception which is IS-A.
    }
}

