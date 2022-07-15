package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

/**
 *
 * @author Sridhar Guzzu
 */
public class InsertTableData {

    public static void main(String args[]) {
        LocalDateTime ld = LocalDateTime.now();
        Connection conn = UseMySql.useDb("emloyees");
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("insert into employees values"
                    + "(219,'bill','gates','bg@ms.com',555555555,'1974-03-16',8,5000,101,4)");
            UseMyLog.loginsert(1, "Employees");
//stmt.execute("insert into employees (employee_id,last_name,email,hire_date,job_id,salary) values(211,'david','ss@s.com','1999-3-3',8,2566)");
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
