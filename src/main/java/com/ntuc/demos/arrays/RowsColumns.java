package com.ntuc.demos.arrays;
/**
 *
 * @author Sridhar Guzzu
 */
public class RowsColumns {

    static String s="";

    public static void main(String args[]) {
        int rows = 10;
        int cols = 2;
        int[][] table = new int[rows][cols];   

        for (int row = 0; row < rows; row++) {  
            for (int col = 0; col < cols; col++) {  
                table[row][col] = row + col;
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                s += " " + table[row][col];
            }
            System.out.println(s);
            s = "";
        }
    }
}


