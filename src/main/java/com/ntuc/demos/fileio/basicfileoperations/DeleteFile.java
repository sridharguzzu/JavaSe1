package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class DeleteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File myFile = new File("d:\\Javaio\\samples\\Newfile.txt");
        if (myFile.exists()) {
            myFile.delete();
            System.out.println(myFile.getName() + " deleted ");
        }
        else{
            System.out.println("File not found");
        }
    }
}
