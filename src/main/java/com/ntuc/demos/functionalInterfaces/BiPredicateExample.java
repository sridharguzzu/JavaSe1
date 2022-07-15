package com.ntuc.demos.functionalInterfaces;

import java.util.function.BiPredicate;

/**
 *
 * @author Sridhar Guzzu
 */
public class BiPredicateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(checkPasswordLen.test("password", 9));
    }
    
    // Check password length using the BiPredicate
    static BiPredicate <String, Integer> checkPasswordLen = (x, y) -> {
            return x.length() == y;
        };
    
    
    
    
}
