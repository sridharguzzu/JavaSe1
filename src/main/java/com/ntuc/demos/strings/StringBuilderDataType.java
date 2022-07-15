package com.ntuc.demos.strings;

/**
 *
 * @author Sridhar Guzzu
 */
public class StringBuilderDataType {

    public StringBuilderDataType(String hello) {
    }

    /**
     * @param args the command line arguments
     */
    
    // Performs better than StringBuffer
    public static void main(String args[]) {
        StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);        
    }
}
