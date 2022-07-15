package com.ntuc.demos.arrays;

import java.util.Arrays;


public class ArrayCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arr1 = new int[]{1, 2, 3, 4};

        System.out.println("Using the double equals method uses the Object ID");
        if (arr == arr1) {
            System.out.println("Arrays are same");
        } else {
            System.out.println("Arrays are different");
        }

        System.out.println("Using the Arrays.equals method uses the Values in the array");
        if (Arrays.equals(arr, arr1)) {
            System.out.println("Arrays are same");
        } else {
            System.out.println("Arrays are different");
        }
    }
}
