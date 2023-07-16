package questions;


import java.io.*;

public class Questions {
    // BufferedWriter ve BufferedReader kullanılmalı.
    // try-with-resource kuralına uyulmalı.
    // dosya var mı yok mu kontrolü yapılmalı. yoksa oluşturulmalı
    // Array içerisinde bulunan isimleri dosyaya yazan ve daha sonrasında bunları okuyup
    //başka bir array içerisine atan program.

    public static void main(String[] args) throws IOException {
        String [] names = {"cabir", "ahmet","fatma"};
        String [] newNames = new String[names.length];
        String fileName = "question.txt";
        String data;
        File file = new File(fileName);

        if(!file.exists()) {
            file.createNewFile();
        }

        System.out.println("buffered writer");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            for (String name : names) {
                bufferedWriter.write(name);
                bufferedWriter.newLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("buffered reader");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            int i=0;
            while((data = bufferedReader.readLine()) != null) {
                newNames[i] = data;
                i++;
            }
        }
        System.out.println("newArray print");
        for (String name : newNames) {
            System.out.println(name);
        }
    }

}
