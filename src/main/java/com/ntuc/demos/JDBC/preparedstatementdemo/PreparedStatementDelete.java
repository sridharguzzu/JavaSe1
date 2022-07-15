package com.ntuc.demos.JDBC.preparedstatementdemo;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sridhar Guzzu
 */
public class PreparedStatementDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");
        try {
            PreparedStatement ps = conn.prepareStatement("delete from employees where employee_id=?");
            ps.setInt(1, 211);
            int rows = ps.executeUpdate();
            System.out.println(rows +" rows deleted");
        } catch (SQLException se) {
        }

    }
}
