package com.ntuc.demos.arrays;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class CapitalsAndCountries {

    static String s = "";

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        int rows = 3;
        int cols = 2;
        String[][] table = new String[rows][cols];

        for (int country = 0; country < rows; country++) {
                            System.out.println("Enter Country and capital:" );
            for (int capital = 0; capital < cols; capital++) {
                table[country][capital] = String.format("%-15s", scan.next());
            }
        }

        String head = String.format("%-15s %-15s", "Country", "Capital");
        System.out.println(head);
        System.out.println("--------------------------------");
        for (int country = 0; country < rows; country++) {
            for (int capital = 0; capital < cols; capital++) {
                s = s + table[country][capital];
            }
            System.out.println(s);
            s = "";
        }
    }
}
