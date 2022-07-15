package com.ntuc.demos.conditions;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input your age: ");
        int input = reader.nextInt();

        if (input > 18) {
            System.out.println("eligible to vote!");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
