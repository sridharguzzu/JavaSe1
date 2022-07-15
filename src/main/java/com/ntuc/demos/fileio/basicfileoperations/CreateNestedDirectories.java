package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class CreateNestedDirectories {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File myFile = new File("d:\\Javaio\\samples");
        if (!myFile.exists()) {
            myFile.mkdirs();
            System.out.println("Directories Created");
        }
        else
        {
            System.out.println("Directories exists");
        }
    }
    }

