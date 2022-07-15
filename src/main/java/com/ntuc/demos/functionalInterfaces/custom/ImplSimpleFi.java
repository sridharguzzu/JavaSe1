package com.ntuc.demos.functionalInterfaces.custom;

/**
 *
 * @author Sridhar Guzzu
 */
public class ImplSimpleFi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SimpleFi s = (i) -> System.out.println(i);
        s.print("Test");
    }
}
