package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDbProcess carDbProcess = new CarDbProcess();
        DbConnection dbConnection = new DbConnection();

        Car insertCar = new Car("Porsche", "taycan", 2302);
        List<Car> carList = new ArrayList<>();
        try (Connection conn = dbConnection.getDBConnection()) { //try-with-resource // no-needed conn.close in finally
            carDbProcess.insertCar(conn, insertCar);
            carList.addAll(carDbProcess.selectAllCars(conn));
       //     carDbProcess.deleteCarByModel(conn, "taycan");
            carDbProcess.updateCarModelByYear(conn, "java", 2053);
            // Bağlantıyı kapatma
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //System.out.println(carList); for-each
    }
}