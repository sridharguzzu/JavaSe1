package com.ntuc.demos.loops;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number to find its factorial: ");
        int num = scan.nextInt();
        int input = num;
        int result = 1;
        while (num > 0) {
            result = result * num;
            num--;
        }
        System.out.println("The factorial of "+ input + " is " + result);
    }
}
