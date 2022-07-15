package com.ntuc.demos.JDBC.resultsetype;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sridhar Guzzu
 */
public class ChangeResultSetType {

    /**
     * @param args the command line arguments
     */
    static Connection Conn;
    static ResultSet rs;

    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");

        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
  ResultSet.CONCUR_UPDATABLE);
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
            rs.last();
            System.out.println(rs.getRow()+" Rows Selected");

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
