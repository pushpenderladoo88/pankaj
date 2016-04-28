package net.pankaj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataAccess {
        private static Connection connection = null;

        public static Connection getConnection() {
                if (connection != null)
                        return connection;
                else {
                try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/air","root","12345");
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return connection;
        }
        }
}

