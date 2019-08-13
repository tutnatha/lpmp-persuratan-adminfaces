package com.journaldev.jsf.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//                        Class.forName("org.postgresql.Driver");
//			Connection con = DriverManager.getConnection(
//					"jdbc:postgresql://localhost:5432/xxydb", "postgres", "postgresql");
            Connection con = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/playground?profileSQL=true", "root", ""); //pwd=lpmp@123
                    "jdbc:mysql://wisty-lenovo-g405:3306/playground?profileSQL=true", "root", "");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->"
                    + ex.getMessage());
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
