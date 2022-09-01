package com.facebook.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDataSource {

    public static final String URL = "jdbc:mysql://localhost:3306/user";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "java";

    public static Connection connection;


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
