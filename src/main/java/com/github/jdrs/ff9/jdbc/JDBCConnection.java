package com.github.jdrs.ff9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    public Connection getConnection() {
        Connection connection = null;

        try {
            String connectionURL = "jdbc:mysql://localhost:3306/ff9db";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL, "root", "toor");
        } catch (SQLException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}