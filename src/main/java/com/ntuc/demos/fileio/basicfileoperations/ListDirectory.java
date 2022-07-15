package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class ListDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        File myFile = new File("d:\\Javaio\\samples");
        File myFile = new File("d:\\Javaio");
        
        if (myFile.isDirectory()) {
           String[] files = myFile.list();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }
    }
}
