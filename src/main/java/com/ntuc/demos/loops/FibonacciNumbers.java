package com.ntuc.demos.loops;

/**
 *
 * @author Sridhar Guzzu
 */
public class FibonacciNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] fibNums = new int[50];
        fibNums[0] = 0;
        fibNums[1] = 1;
        for (int i = 2; i < fibNums.length; i++) {
            fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
        }
        for (int i = 0; i < fibNums.length; i++) {
            System.out.println(fibNums[i]);
        }
    }
}
