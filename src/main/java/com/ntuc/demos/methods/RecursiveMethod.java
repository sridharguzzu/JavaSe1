package com.ntuc.demos.methods;

/**
 *
 * @author Sridhar Guzzu
 */
public class RecursiveMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        System.out.println(k);
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
