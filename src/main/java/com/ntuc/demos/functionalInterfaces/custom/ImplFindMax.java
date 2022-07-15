package com.ntuc.demos.functionalInterfaces.custom;

/**
 *
 * @author Sridhar Guzzu
 */
public class ImplFindMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FindMax fm = (n1, n2)
                -> {
            if (n1 > n2) {
                return n1;
            } else {
                return n2;
            }
        };
        
        int  res = fm.findMax(10, 20);
        System.out.println(res);
    }
}

