package net.pankaj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataAccess {
        private static Connection connection = null;

        public static Connection getConnection() {
                if (connection != null)
                        return connection;
                else {
                String serverName = "127.0.0.1";
                String portNumber = "1521";
                String sid = "XE";
                String dbUrl = "jdbc:mysql://localhost/air" + serverName + ":" + portNumber
                                + ":" + sid;
                try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection(dbUrl, "root", "12345");
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return connection;
        }
        }
}