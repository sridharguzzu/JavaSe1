package com.ntuc.demos.methods;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] x = {5, 4, 3, 2, 1};

        add(x);

        System.out.println("main: " + Arrays.toString(x));
    }

    public static void add(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] += 10;
        }
    }

}
