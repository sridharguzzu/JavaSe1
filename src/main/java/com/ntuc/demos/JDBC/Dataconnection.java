package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sridhar Guzzu
 */
public class Dataconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Attempting to establish MySQL connection");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException cne) {
            System.out.println("MySQL driver not found" + cne.getMessage());
            return;
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emloyees", "root", "root");
            System.out.println("MySQL Connection established");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("MySQL Connection closed");
                }
            } catch (SQLException se1) {
                System.out.println(se1.getMessage());
            }
        }
    }
}
