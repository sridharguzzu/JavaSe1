package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sridhar Guzzu
 */
public class DeleteTableData {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("delete from employees where employee_id=219");
//            System.out.println(rows+ " rows deleted");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException se1) {
                System.out.println(se1.getMessage());
            }
        }
    }
}
