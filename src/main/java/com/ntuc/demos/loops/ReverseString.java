package com.ntuc.demos.loops;

/**
 *
 * @author Sridhar Guzzu
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(reverse("reverse"));
    }
    
    static String reverse(String str){
        
        String rev = "";

        for (int i = str.length(); i > 0; i--) {
            rev = rev + str.charAt(i - 1);
        }
        return rev;
    }
}
