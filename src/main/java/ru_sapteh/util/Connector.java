package ru_sapteh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private Connector() {

    }

    public static Connection getInstance() {
        PropertyUtil property = new PropertyUtil();
        Connection connection = null;
        try {
            Class.forName(property.getProperties("driver"));
            connection = DriverManager.getConnection(property.getProperties("url"),
                    property.getProperties("user"),
                    property.getProperties("password"));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed");
        }
        return connection;
    }

    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
