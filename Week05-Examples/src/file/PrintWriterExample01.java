package file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample01 {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("printWriter.txt");
            printWriter.println("merhaba");
            printWriter.println("dünya");
            printWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
          //  printWriter.close();
        }

        printWriter.println("Merhaba, Dünya!");
        printWriter.printf("Sayı: %d, Metin: %s", 42, "OpenAI");
        printWriter.flush();
    }
}
