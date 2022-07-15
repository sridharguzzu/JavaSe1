package com.ntuc.demos.datatypes;

/**
 *
 * @author Sridhar Guzzu
 */
public class VariableSwap {

    int v1 = 10, v2 = 20;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        VariableSwap vs = new VariableSwap();
        vs.swapWithTemp();
        vs.simpleSwap();

    }

    void swapWithTemp() {
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println("v1 is: " + v1 + " & v2 is: " + v2);
    }

    void simpleSwap() {
        v1 = v1 + v2;
        v2 = v1 - v2;
        v1 = v1 - v2;
        System.out.println("v1 is: " + v1 + " & v2 is: " + v2);
    }

}
