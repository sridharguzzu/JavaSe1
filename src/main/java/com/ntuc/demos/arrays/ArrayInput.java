package com.ntuc.demos.arrays;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String[] names = new String[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a Name: ");
            names[i] = scan.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }
   
}
