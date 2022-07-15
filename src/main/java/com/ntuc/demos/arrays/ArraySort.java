package com.ntuc.demos.arrays;

import java.util.Arrays;

public class ArraySort {
   static int[] num_arr = {1,2,3,4,6,5,8,7,9,0};
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        sort_array();
    }
    
    static void sort_array(){
        // Sorting array
        Arrays.sort(num_arr);
        for (int i = 0; i < num_arr.length; i++) {
            System.out.println(num_arr[i]);
        }
    }
}
