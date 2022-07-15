package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class CreateDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File myFile = new File("d:\\Javaiosamples");
        if (!myFile.exists()) {
            myFile.mkdir();
            System.out.println("Directory Created");
        }
        else
        {
            System.out.println("Directory exists");
        }
    }
}
