package com.ntuc.demos.fileio.basicfileoperations;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Sridhar Guzzu
 */
public class WriteToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter(".\\javafileio\\newfile.txt");
            fw.write("This is a sample text being written using Java File io");
            fw.write("""
                     
                     This is another sample text 
                     being written 
                            using Java File io""");
            
            fw.close();
            System.out.println("Write succeeded");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
