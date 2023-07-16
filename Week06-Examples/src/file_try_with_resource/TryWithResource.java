package file_try_with_resource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class TryWithResource {

    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("try-with-resouce.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("try with resource example");
        }catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("try-with-resouce.txt"))) {

            bufferedWriter.write("try with resource example");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
