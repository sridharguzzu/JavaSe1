package com.ntuc.demos.math;

/**
 *
 * @author Sridhar Guzzu
 */
public class MathDotRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(Math.random()); //returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        int randNum = (int) (Math.random() * 100); //returns a random number between 0 to 100:
        System.out.println(randNum);
        
        
    }
}
