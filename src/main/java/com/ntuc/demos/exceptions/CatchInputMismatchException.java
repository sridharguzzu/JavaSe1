package com.ntuc.demos.exceptions;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class CatchInputMismatchException {

    static int f;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("The age Entered is " + getAge());
    }

    static int getAge() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter your age");
            f = scan.nextInt();
            //return f;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid input for age");
            getAge();
        } finally {
            return f;
        }
    }
}
