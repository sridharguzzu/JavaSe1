package com.ntuc.demos.JDBC.statementmethods;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sridhar Guzzu
 */
public class ExecuteUpdateMethod {

    static int rows;

    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");
        try {
            Statement stmt = conn.createStatement();
            
            /* 
            executeUpdate method 
            1. Used to update or modify database
            2. Returns a integer value denoting the number of records affected.
            3. Return value is always 0 in case of a DDL statement
            4. throws SQL exception
            5. can be used with following SQL statement
                a. DML statements ( INSERT, DELETE, UPDATE)
                b. DDL  (Create, Drop)
            */
            
            rows = stmt.executeUpdate("update employees set salary = 77666 where employee_id=211");
        } catch (SQLException se) {
            rows = 0;
            System.out.println(se.getMessage());
        } finally {
            try {
                System.out.println(rows + " rows updated");
                conn.close();
            } catch (SQLException se1) {
                System.out.println(se1.getMessage());
            }
        }
    }
}
