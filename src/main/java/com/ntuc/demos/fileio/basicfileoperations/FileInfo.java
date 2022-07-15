package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class FileInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File myFile = new File(".\\javafileio\\newfile.txt");
        if (myFile.exists()) {
            System.out.println("The file name is: " + myFile.getName());
            System.out.println("Absolute Path is: " + myFile.getAbsolutePath());
            System.out.println("File path: " + myFile.getPath());
            System.out.println("Is file Wriable: " + myFile.canWrite());
            System.out.println("Is file Readable: " + myFile.canRead());
            System.out.println("File size: " + myFile.length());
        } else {
            System.out.println(myFile + "does not exist");
        }
    }
}
