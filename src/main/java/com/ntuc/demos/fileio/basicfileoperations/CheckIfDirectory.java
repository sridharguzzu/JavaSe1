package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class CheckIfDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File myFile = new File("d:\\Javaio\\samples");
        if (myFile.isDirectory()) {
            System.out.println("The path points to a folder");
        } else if (myFile.isFile()) {
            System.out.println("The path points to a file");
        }
    }
}
