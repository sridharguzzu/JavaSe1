package com.ntuc.demos.loops;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class PowerOfNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to expand: ");
        int x = sc.nextInt();
        System.out.print("Enter the number of times you want to expand: ");
        int y = sc.nextInt();
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        System.out.println(result);
    }
}
