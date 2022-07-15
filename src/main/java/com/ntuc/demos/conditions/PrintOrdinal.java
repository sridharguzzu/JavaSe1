package com.ntuc.demos.conditions;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class PrintOrdinal {

    /**
     * @param args the command line arguments
     */
    static String[] ordinal = new String[]{"th", "st", "nd", "rd", "th"};

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("The ordinal number for " + i + " is " + i + ord(i));
    }

    static String ord(int i) {
        int k = i % 10;
        if (k >= 4) {
            return ordinal[4];
        } else {
            return ordinal[k];
        }
    }
}

