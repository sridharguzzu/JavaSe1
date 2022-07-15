package com.ntuc.demos.fileio.basicfileoperations;


import java.io.File;
import java.io.IOException;


/**
 *
 * @author Sridhar Guzzu
 */
public class CreateFile {

    public static void main(String args[]) {
        
        // create new file returns boolean
        File myFile = new File(".\\javafileio\\newfile.txt"); 

        try {
            // check if file was created

            if (myFile.createNewFile()) {
                System.out.println(myFile.getName() + " Created ");
            } else {
                System.out.println(myFile.getName() + " Exists ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
