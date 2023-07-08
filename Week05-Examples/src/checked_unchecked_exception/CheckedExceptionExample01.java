package checked_unchecked_exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionExample01 {
    public static void main(String[] args)/* throws IOException*/ {

        try {
            FileWriter fileWriter = new FileWriter("file.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("CheckedExceptionExample01 devam ediyor\n");

    }
}
