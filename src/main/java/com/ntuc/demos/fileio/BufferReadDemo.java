package com.ntuc.demos.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sridhar Guzzu
 */
public class BufferReadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("boutput.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
