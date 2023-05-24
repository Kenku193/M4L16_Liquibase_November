package org.example.dataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionData {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/M4L16_Liquibase";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "qwerty";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(
                DB_URL,
                DB_USER,
                DB_PASSWORD
        );

    }

}
