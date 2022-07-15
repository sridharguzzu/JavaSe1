package com.ntuc.demos.JDBC.preparedstatementdemo;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sridhar Guzzu
 */
public class PreparedStatementSelect {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");
        try {
            PreparedStatement ps = conn.prepareStatement("select last_name , salary from  employees where salary<?");
            ps.setInt(1, 3000);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("last_name") + " -- " + rs.getDouble("salary"));
            }
        } catch (SQLException se) {
        }
    }
}
