package com.ntuc.demos.JDBC;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *
 * @author Sridhar Guzzu
 */
public class UseMyLog {

    /**
     * @param args the command line arguments
     */
    public static void loginfo(LocalDateTime ld, String message) {
        try {
            FileWriter fw = new FileWriter(".\\dbaccesslog.txt", true);
            fw.write("\n" + "Database Access: " + message + " at " + ld);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void loginsert(int rec, String tname){
                try {
            FileWriter fw = new FileWriter(".\\dbaccesslog.txt", true);
            fw.write("\n" + "Database Access: " + rec + " rows inserted into " + tname);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
