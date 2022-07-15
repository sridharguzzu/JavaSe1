package com.ntuc.demos.exceptions;

/**
 *
 * @author Sridhar Guzzu
 */
public class CatchNumberFormatException {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
        int n = Integer.parseInt("100");
        System.out.println(n);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
