package com.ntuc.demos.fileio.basicfileoperations;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sridhar Guzzu
 */
public class AppendToFile {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter(".\\javafileio\\newfile.txt", true);
            fw.write("""
                     This is a sample text being appended using Java File io""");
            fw.close();
            System.out.println("Append succeeded");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
