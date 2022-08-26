package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sridhar Guzzu
 */
public class ReadTableMetadata {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("emloyees");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees");
            ResultSetMetaData rsm = rs.getMetaData();
            System.out.println("List of columns in Employees table:");
            System.out.println("There area total of "
                    + rsm.getColumnCount()
                    + " Columns "
            );
            System.out.println(rsm.getCatalogName(1));  // Schema name
            for (int i = 1; i < rsm.getColumnCount(); i++) {
                System.out.println(
                        "Column: "
                        + rsm.getColumnName(i).toUpperCase()
                        + " is of "
                        + rsm.getColumnTypeName(i)
                        + " Datatype "
                );
            }

        } catch (SQLException se) {
            System.out.println(se.getMessage());
          
        }
    }
}
