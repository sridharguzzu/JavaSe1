package com.ntuc.demos.fileio.basicfileoperations;

import java.io.File;

/**
 *
 * @author Sridhar Guzzu
 */
public class DeleteDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         File myFile = new File("d:\\Javaio");
         if(deleteDir(myFile)){
             System.out.println("Directory deleted");
         }
    }

    public static boolean deleteDir(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    deleteDir(files[i]);
                } else {
                    files[i].delete();
                }
            }
        }
        return dir.delete();
    }
}
