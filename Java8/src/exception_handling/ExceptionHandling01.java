package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionHandling01 {
    public static void main(String[] args) {
        //Before Java7
        try {
            throwErrorMethod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //After Java7
  /*      try {
        //    throwErrorMethod();
            FileInputStream fileIn = new FileInputStream("fileName");
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("hata var.");
        }*/
    }

    public static void throwErrorMethod() throws Exception {
        throw new Exception("error");
    }
}
