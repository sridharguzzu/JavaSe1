package com.ntuc.demos.exceptions;

/**
 *
 * @author Sridhar Guzzu
 */
public class CatchStringIndexOutOfBoundException {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            String s = "This is sample text";
            char c = s.charAt(10);
            System.out.println(c);
            int n = Integer.parseInt("s");
            System.out.println(n);
        } catch (StringIndexOutOfBoundsException se) {
            System.out.println("SOB exception occurred");
        }catch(NumberFormatException nfe){
            System.out.println("NFE exception occurred");
        }

    }
}
