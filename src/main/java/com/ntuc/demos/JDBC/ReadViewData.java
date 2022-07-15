package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sridhar Guzzu
 */
public class ReadViewData {

    /**
     * @param args the command line arguments
     */
    static Connection Conn;
    static ResultSet rs;

    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");

        try {
            Statement stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from emp_dep");
            while (rs.next()) {
                System.out.println(rs.getString(1)
                        + "---" + rs.getString(2)
                        + "---" + rs.getString(3)
                );
            }
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                rs.close();
                conn.close();
            } catch (SQLException se1) {
                System.out.println(se1.getMessage());
            }
        }
    }
}
