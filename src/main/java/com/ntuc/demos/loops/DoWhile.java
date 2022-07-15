package com.ntuc.demos.loops;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String capture;
        String text = "";
        do {
            capture = scan.next();
            text += " "+ capture;
        } while (!capture.toLowerCase().equals("done") );
        System.out.println(text);
    }
}

