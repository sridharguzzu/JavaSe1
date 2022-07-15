package com.ntuc.demos.operators;

/**
 *
 * @author Sridhar Guzzu
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int x = 5;
        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 4);
        System.out.println(!(x > 3 && x < 10));
    }
}
