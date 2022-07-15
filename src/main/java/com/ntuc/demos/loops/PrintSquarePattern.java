package com.ntuc.demos.loops;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class PrintSquarePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows upto which you want to print square pattern : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
