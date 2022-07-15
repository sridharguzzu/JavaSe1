package com.ntuc.demos.JDBC.preparedstatementdemo;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");
        try {
            PreparedStatement ps = conn.prepareStatement("insert into departments values (?,?,?)");
            ps.setInt(1, 13);
            ps.setString(2, "Banking");
            ps.setInt(3, 1700);
            int rows = ps.executeUpdate();
            System.out.println(rows +" rows updated");
        } catch (SQLException se) {
        }

    }
}
