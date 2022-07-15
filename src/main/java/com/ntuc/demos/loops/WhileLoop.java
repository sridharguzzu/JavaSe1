package com.ntuc.demos.loops;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
