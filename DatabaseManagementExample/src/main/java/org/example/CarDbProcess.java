package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDbProcess {

    void insertCar(Connection conn, Car insertCar) throws SQLException {
        // INSERT işlemi
        String insertSQL = "INSERT INTO cars (brand, model, year) VALUES (?, ?, ?)";
        PreparedStatement insertStatement = conn.prepareStatement(insertSQL);
        insertStatement.setString(1, insertCar.getBrand());
        insertStatement.setString(2, insertCar.getModel());
        insertStatement.setInt(3, insertCar.getYear());
        int affectedRows = insertStatement.executeUpdate();
        System.out.println("INSERT işlemi sonucunda etkilenen satır sayısı: " + affectedRows);

    }

    List<Car> selectAllCars(Connection conn) throws SQLException {
        // SELECT işlemi
        String selectSQL = "SELECT * FROM cars";
        PreparedStatement selectStatement = conn.prepareStatement(selectSQL);
        ResultSet resultSet = selectStatement.executeQuery();
        List<Car> carList = new ArrayList<>();
        while (resultSet.next()) {
            // Sonuçları işleme
            String brand = resultSet.getString("brand");
            String model = resultSet.getString("model");
            int year = resultSet.getInt("year");
            Car car = new Car(brand, model, year);
            carList.add(car);
            System.out.println("brand: " + brand + ", year: " + year);
        }
        return carList;
    }

    public void deleteCarByModel(Connection conn, String model) throws SQLException {
        // DELETE işlemi
        String deleteSQL = "DELETE FROM cars WHERE model = ?";// AND year = ?
        PreparedStatement deleteStatement = conn.prepareStatement(deleteSQL);
        deleteStatement.setString(1, "taycan");
        int affectedRows = deleteStatement.executeUpdate();
        System.out.println("DELETE işlemi sonucunda etkilenen satır sayısı: " + affectedRows);
    }

    public void updateCarModelByYear(Connection conn, String model, int year) throws SQLException {
        // UPDATE işlemi
        String updateSQL = "UPDATE cars SET model = ? WHERE year = ?";
        PreparedStatement updateStatement = conn.prepareStatement(updateSQL);
        updateStatement.setString(1, model);
        updateStatement.setInt(2, year);
        int affectedRows = updateStatement.executeUpdate();
        System.out.println("UPDATE işlemi sonucunda etkilenen satır sayısı: " + affectedRows);
    }
}
