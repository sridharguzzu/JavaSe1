package com.ntuc.demos.strings;

/**
 *
 * @author Sridhar Guzzu
 */
public class TitleCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(title("alvin"));
    }
    
    static String title(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
}
