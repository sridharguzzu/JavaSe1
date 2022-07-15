package com.ntuc.demos.functionalInterfaces;

import java.util.function.Consumer;

/**
 *
 * @author Sridhar Guzzu
 */
public class ConsumerFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // call to imperative approach
        greet("Simon");
        // call to functional approach
        greet.accept("James");
    }

    // imperative program with void
    static void greet(String user) {
        System.out.println("Hello " + user);
    }

    // functional program using consumer method
    // Consumer is as good as void in imperative program
    // Consumer is a single argument void method equivalent
    static Consumer<String> greet = user -> System.out.println("Hello " + user);
}
