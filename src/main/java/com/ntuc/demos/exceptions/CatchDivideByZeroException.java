package com.ntuc.demos.exceptions;

/**
 *
 * @author Sridhar Guzzu
 */
public class CatchDivideByZeroException {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // divide by zero
        int dividend = 10;
        int divisor = 0;
        try {
            int quotient = dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + "Please check code");
        }
    }
}
