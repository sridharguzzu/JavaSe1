package com.ntuc.demos.fileio.images;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Sridhar Guzzu
 */
public class ReadImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
      File file = new File("sample.jpeg");
        FileInputStream fin = new FileInputStream(file);
        long size = file.length();
        byte[] ba = new byte[(int) size];
        fin.read(ba);
        fin.close();
        // writing to a new file
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("output.jpg"))));
        dos.write(ba);
        dos.close();
    }
}
