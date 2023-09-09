package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class ExceptionHandling02 {
    public static void main(String[] args) throws IOException {

        //Before Java7
       /* ZipOutputStream zipFile = null;
        FileInputStream fileIn = null;
        try {
            zipFile = new ZipOutputStream(new FileOutputStream("zipFileName"));
            fileIn = new FileInputStream("fileName");
            //
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            zipFile.close();
            fileIn.close();
        }*/

        //After Java7
        try (ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream("zipFileName"));
             FileInputStream fileIn = new FileInputStream("fileName")) {
            //
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
