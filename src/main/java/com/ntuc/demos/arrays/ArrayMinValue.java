package com.ntuc.demos.arrays;

/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayMinValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] arr = {2, 3, 67, 88, 76};
        System.out.println(findmin(arr));
    }

    static int findmin(int[] arr) {
        int minval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
            }
        }
        return minval;
    }
}
