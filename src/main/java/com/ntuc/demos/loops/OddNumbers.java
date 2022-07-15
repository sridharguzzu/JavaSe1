package com.ntuc.demos.loops;

/**
 *
 * @author Sridhar Guzzu
 */
public class OddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          int num = 100;
        System.out.println("The odd numbers between 1 and 100 are:- ");
        for (int i = 1; i < 101; i++) {
            if(i%2!=0)
                System.out.println(i+ " ");
        }
    }
}
