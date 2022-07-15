package com.ntuc.demos.arrays;

/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayMerge {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String[] arr1 = {"Apple", "Orange", "Banana"};
        String[] arr2 = {"Grapes", "Kiwi", "Mango"};
        String[] arrmerge = new String[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arrmerge[i] = arr1[i];
        }

        for (int i = arr1.length, j = 0; i < arrmerge.length; i++, j++) {
            arrmerge[i] = arr2[j];
        }

        for (int i = 0; i < arrmerge.length; i++) {
            System.out.println(arrmerge[i]);
        }
    }
}
