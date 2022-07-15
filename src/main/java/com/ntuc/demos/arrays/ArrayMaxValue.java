package com.ntuc.demos.arrays;

/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayMaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] arr = {1,2,3,67,88,76};
        System.out.println(findmax(arr));
    }

    static int findmax(int[] arr) {
        int maxval = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
