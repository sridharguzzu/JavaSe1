package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // reading one line  at a time
        System.out.println("reading one line  at a time");
        System.out.println("-------------------------------------");
        try {
            File myFile = new File(".\\javafileio\\newfile1.txt");
            Scanner read = new Scanner(myFile);
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
            read.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        //reading one word at a time
        System.out.println("\n" + "reading one word  at a time");
        System.out.println("-------------------------------------");

        try {
            File myFile = new File(".\\javafileio\\newfile1.txt");
            Scanner read = new Scanner(myFile);
            while (read.hasNext()) {
                System.out.println(read.next());
            }
            read.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
