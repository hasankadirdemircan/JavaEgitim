package buffered_file;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        String filePath = "c://Users/hasan.demircan/Desktop/testfile/fileWriter.txt";
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("hello");
        bufferedWriter.write("hello");
        bufferedWriter.newLine();
        bufferedWriter.write("world");

      //  fileWriter.close();
        bufferedWriter.close();


        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println("bufferedreader ile okunuyor");
        String data;
        while((data = bufferedReader.readLine()) != null) {
            System.out.println(data);
        }
        fileReader.close();
        bufferedReader.close();
    }
}
