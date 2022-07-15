package com.ntuc.demos.loops;

/**
 *
 * @author Sridhar Guzzu
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int num = 1002, rem = 0, res = 0;
        while (num > 0) {
            rem = num % 10;
            res = res * 10 + rem;
            num = num / 10;
            System.out.println(res);
        }
        System.out.println(res);
    }
}
