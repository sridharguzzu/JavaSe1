package com.ntuc.demos.JDBC.preparedstatementdemo;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sridhar Guzzu
 */
public class PreparedStatementUpdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");
        try {
            PreparedStatement ps = conn.prepareStatement("update employees set first_name =? where employee_id=?");
            ps.setString(1, "bailey");
            ps.setInt(2, 211);
            int rows = ps.executeUpdate();
            System.out.println(rows +" rows updated");
        } catch (SQLException se) {
        }

    }
}
