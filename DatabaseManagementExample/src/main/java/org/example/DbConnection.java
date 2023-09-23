package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    // Veritabanına bağlantı oluşturma
    Connection getDBConnection() throws SQLException {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/test";
        String kullaniciAdi = "postgres";
        String parola = "123456";
        return DriverManager.getConnection(jdbcUrl, kullaniciAdi, parola);
    }

}
