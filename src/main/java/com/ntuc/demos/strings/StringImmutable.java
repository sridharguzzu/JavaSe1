package com.ntuc.demos.strings;

/**
 *
 * @author Sridhar Guzzu
 */
public class StringImmutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Showing that Strings are immutable
        String str1 = "Welcome";
        System.out.println(str1.hashCode()); // showing the Object ID of string
        str1 = "Welcome";
        System.out.println(str1.hashCode()); // showing the Object ID of string after reassigning the same value
        str1 = "Welcome To Java";
        System.out.println(str1.hashCode()); // showing the Object ID of string after reassigning the different value
    }
}
