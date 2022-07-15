package com.ntuc.demos.loops;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to test for plaindrome: ");
        String test = scan.next();
        if (test.toLowerCase().equals(ReverseString.reverse(test).toLowerCase())) 
            System.out.println(test + " is a plaindrome");
        else
        System.out.println(test + " is not a plaindrome");

    }
}
