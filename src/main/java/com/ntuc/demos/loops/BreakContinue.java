package com.ntuc.demos.loops;

/**
 *
 * @author Sridhar Guzzu
 */
public class BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Print with Break");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("Print with Continue");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
