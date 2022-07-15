package com.ntuc.demos.arrays;

/**
 *
 * @author Sridhar Guzzu
 */
public class TwoDimentionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[][] arr = {{1, 2, 3, 4}, {3, 4, 5, 7}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);
            }
        }
    }
}
