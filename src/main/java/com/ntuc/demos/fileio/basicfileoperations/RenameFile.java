package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class RenameFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File myFile = new File("d:\\Javaio\\samples\\New Text Document.txt");
        if (myFile.exists()) {
            // renames and creates file in home directory
            myFile.renameTo(new File("d:\\Javaio\\samples\\newfile.txt"));
            // rename and create in same directory
            myFile.renameTo(new File("d:\\Javaio\\samples\\newfile.txt"));
        } else {
            System.out.println("File does not exist");
        }
    }
}
