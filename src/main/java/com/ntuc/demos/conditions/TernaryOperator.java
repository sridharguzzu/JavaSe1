package com.ntuc.demos.conditions;

/**
 *
 * @author Sridhar Guzzu
 */
public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int res = getBigger(20,30);
        System.out.println(res);
        System.out.println(getBigger(10, 20));
    }

    public static int getBigger(int x, int y) {
        return x > y ? x : y; // usage of ternary operator
    }
}
