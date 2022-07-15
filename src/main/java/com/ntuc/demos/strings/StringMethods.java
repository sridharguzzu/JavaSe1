package com.ntuc.demos.strings;

/**
 *
 * @author Sridhar Guzzu
 */
public class StringMethods {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // String Instanstance Methods.
        String str = "Welcome";
        String str1 = "Welcome1";
        System.out.println(str.charAt(0));  // returns the character at the position 0  -- W
        System.out.println(str.concat(" To Java")); // join the strings -- Welcome To Java
        System.out.println(str.equals(str1)); // returns a Boolean -- False
        System.out.println(str.length()); // returns the number of characters -- 7
        System.out.println(str.substring(3)); //Returns the number of characters start from  to the param value -- Come
        System.out.println(str.substring(0,3)); //Returns the number of characters start from  to the param value -- Wel
        System.out.println(str.toLowerCase()); // converts into lower case
        System.out.println(str.toUpperCase()); // converts into upper case
        System.out.println(str.trim()); //  Removes spaces. both trailing and leading 
        System.out.println(str.isEmpty()); // Returns a boolean -- False
        System.out.println(str.indexOf('e')); // the index of the first occurance of the param -- 1
    }
}
