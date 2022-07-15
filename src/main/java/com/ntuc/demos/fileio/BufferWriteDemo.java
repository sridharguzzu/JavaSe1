package com.ntuc.demos.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class BufferWriteDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("boutput.txt"));
            bw.write("This is a sample Text");
            bw.write("\n" + "This is a another sample Text");
            System.out.println("Enter some text:");
            String in = scan.nextLine();
            bw.write("\n" + in + "\n");
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
