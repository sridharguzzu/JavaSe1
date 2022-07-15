package com.ntuc.demos.conditions;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class SeitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int x = 10;

        switch (x) {
            case 1:
            case 5:
            case 7:
                System.out.println("Multiple conditions");
                break;
            case 2:
                System.out.println("Single Condition");
                break;
            case 3:
                System.out.println("Single Condition");
                break;
            default:
                System.out.println("Default condition");
        }
    }
}
