package com.ntuc.demos.functionalInterfaces;

import java.util.function.Function;

/**
 *
 * @author Sridhar Guzzu
 */
public class AndThenFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // using the functional combined method
        int y = combineAddAndMultiply.apply(2);
        System.out.println("output of Functional method: " + y);
    }

    // Functional method to increment by 1
    static Function<Integer, Integer> incrementByOne = number -> number += 1;

    //functional mehthod to mutiply by 5
    static Function<Integer, Integer> multiplyByfive = number -> number * 5;

    // functiona method to comble the above 2 functions
    static Function<Integer, Integer> combineAddAndMultiply
            = incrementByOne.andThen(multiplyByfive);

}
