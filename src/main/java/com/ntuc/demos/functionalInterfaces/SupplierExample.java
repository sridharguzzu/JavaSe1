package com.ntuc.demos.functionalInterfaces;

import java.util.Random;
import java.util.function.Supplier;

/**
 *
 * 
 * @author Sridhar Guzzu
 */
public class SupplierExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Exact oppsite to Consumer
        // Returns a value without an input parameter
         Supplier<Integer> rds = () -> new Random().nextInt(10);
         System.out.println(rds.get());
    }
}
