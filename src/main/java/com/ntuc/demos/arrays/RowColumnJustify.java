package com.ntuc.demos.arrays;

public class RowColumnJustify {
    public static void main(String[] args) {
        String[] colors = { "red", "orange", "blue", "green" };
        int[] numbers = { 42, 100, 200, 90 };
        
        // Loop over both arrays.
        for (int i = 0; i < colors.length; i++) {
            // Left-justify the color string.
            // ... Right-justify the number.
            String line = String
                    .format("%-10s %10d", colors[i], numbers[i]);
            System.out.println(line);
        }
    }
}