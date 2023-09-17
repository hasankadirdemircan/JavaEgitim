package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/test";
        String kullaniciAdi = "postgres";
        String parola = "123456";
        List<Car> carList = null;
        Car insertCar = new Car("Porsche", "taycan", 2302);
        try (Connection conn = DriverManager.getConnection(jdbcUrl, kullaniciAdi, parola)) { //try-with-resource // no-needed conn.close in finally
            // Veritabanına bağlantı oluşturma

            // INSERT işlemi
            String insertSQL = "INSERT INTO cars (brand, model, year) VALUES (?, ?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(insertSQL);
            insertStatement.setString(1, insertCar.getBrand());
            insertStatement.setString(2, insertCar.getModel());
            insertStatement.setInt(3, insertCar.getYear());
            int affectedRows = insertStatement.executeUpdate();
            System.out.println("INSERT işlemi sonucunda etkilenen satır sayısı: " + affectedRows);

            // SELECT işlemi
            String selectSQL = "SELECT * FROM cars";
            PreparedStatement selectStatement = conn.prepareStatement(selectSQL);
            ResultSet resultSet = selectStatement.executeQuery();
            carList = new ArrayList<>();
            while (resultSet.next()) {
                // Sonuçları işleme
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                int year = resultSet.getInt("year");
                Car car = new Car(brand, model, year);
                carList.add(car);
                System.out.println("brand: " + brand + ", year: " + year);
            }

            // Bağlantıyı kapatma
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(carList);
    }
}