package file;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        if(!file.exists()) {
            //file yok
            file.createNewFile();
        }

        //after create
        System.out.println("after create");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}
