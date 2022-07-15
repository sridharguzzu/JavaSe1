package com.ntuc.demos.functionalInterfaces;

import java.util.function.Function;

/**
 *
 * @author Sridhar Guzzu
 */
public class SimpleFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //using the imperative method
        int x = incrementByOne(1);
        System.out.println("output of imperative method: " + x);
        // using the functional method
        int y = incrementByOne.apply(1);
        System.out.println("output of Functional method: " + y);
        System.out.println(len.apply("String Length"));
   
    }

    // imperative program
    static int incrementByOne(int num) {
        return num += 1;
    }
    // Functional method
    // using Function which accepts one argument and a return type
    static Function<Integer, Integer> incrementByOne = number -> number += 1;
    static Function<String,Integer> len = x -> x.length();
}
