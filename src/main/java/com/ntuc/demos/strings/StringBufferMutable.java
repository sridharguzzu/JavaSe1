package com.ntuc.demos.strings;

/**
 *
 * @author Sridhar Guzzu
 */
public class StringBufferMutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Welcome");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        sb.append(" To Java");
        System.out.println(sb);
        System.out.println(sb.hashCode());
    }
}
