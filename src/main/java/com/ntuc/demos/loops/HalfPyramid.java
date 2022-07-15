package com.ntuc.demos.loops;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class HalfPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number upto which you want to print inverted half pyramid pattern : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
