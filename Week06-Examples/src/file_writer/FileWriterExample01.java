package file_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {
    public static void main(String[] args) throws IOException {
        String[] names = {"ayşe", "fatma", "ali", "mehmet"};
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            // Creates a FileWriter
            fileWriter = new FileWriter("output.txt", true);

            for (String name : names) {
                // Writes the string to the file
                fileWriter.write(name);
                fileWriter.write(System.lineSeparator());
            }

        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            // Closes the writer
            fileWriter.close();
        }

       System.out.println("file read işlemi");
       fileReader = new FileReader("output.txt");
        int i;
        while( (i=fileReader.read()) != -1) {
            System.out.print((char)i);
        }
        fileReader.close();
    }
}
