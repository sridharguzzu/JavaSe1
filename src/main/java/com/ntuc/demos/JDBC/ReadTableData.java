package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sridhar Guzzu
 */
public class ReadTableData {

    /**
     * @param args the command line arguments
     */
    static Connection Conn;
    static ResultSet rs;

    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");

        try {
            Statement stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from employees");
              while (rs.next()) {
                System.out.println(rs.getInt("employee_id")
                        + "---" + rs.getString("first_name")
                        + "---" + rs.getString(3)
                        + "---" + rs.getString(4)
                        + "---" + rs.getString(5)
                        + "---" + rs.getDate(6)
                        + "---" + rs.getInt(7)
                        + "---" + rs.getDouble(8)
                        + "---" + rs.getInt(9)
                        + "---" + rs.getInt(10)
                );
            }
            rs = stmt.executeQuery("select count(*) from employees");
            rs.next();
            System.out.println(rs.getInt(1) + " rows selected");

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
