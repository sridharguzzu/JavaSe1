package com.ntuc.demos.functionalInterfaces;

import java.util.function.BiFunction;

/**
 *
 * @author Sridhar Guzzu
 */
public class BiFunctionSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //using the Imperative method
        int x = calculate(1,5);
        System.out.println("output of imperative method: " + x);
        // using the BiFunctional method
        int y = calculate.apply(1, 5);
        System.out.println("output of Functional method: " + y);
//        System.out.println(calculate.apply(1, 5));
    }

    // imperative program
    static int calculate(int x, int y) {
        return (x + 1) * y;
    }
    // BiFunctional method
    // accepts two arguments and and return
    static BiFunction<Integer, Integer, Integer> calculate = (x,y)-> (x+1)*y;

}
