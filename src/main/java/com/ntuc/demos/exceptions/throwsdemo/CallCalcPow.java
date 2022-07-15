package com.ntuc.demos.exceptions.throwsdemo;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class CallCalcPow {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        CalcPow cp = new CalcPow();

        int i = scan.nextInt();
        int m = scan.nextInt();

        try {
            System.out.println(cp.pow(i, m));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
