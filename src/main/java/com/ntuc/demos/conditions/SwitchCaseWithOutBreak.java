package com.ntuc.demos.conditions;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class SwitchCaseWithOutBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 7: ");
        int dow = scan.nextInt();

        switch (dow) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 2:
                System.out.println("Working");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
