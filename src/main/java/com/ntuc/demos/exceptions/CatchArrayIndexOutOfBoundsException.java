package com.ntuc.demos.exceptions;

/**
 *
 * @author Sridhar Guzzu
 */
public class CatchArrayIndexOutOfBoundsException {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[1] = 9; // accessing 7th element in an array of
            // size 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block");
        }
    }
}
