package com.ntuc.demos.JDBC;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author Sridhar Guzzu
 */
public class UseMySql {

    static FileWriter fw;

    public static Connection useDb(String db) {
        LocalDateTime timenow = LocalDateTime.now();
        String url = "jdbc:mysql://localhost:3306/" + db;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cne) {
            System.out.println("MySQL driver not found" + cne.getMessage());
            return null;
        }
        try {
            Connection conn = DriverManager.getConnection(url, "root", "root");
            UseMyLog.loginfo(timenow, "Connection Established");
            return conn;
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
        return null;
    }

}
