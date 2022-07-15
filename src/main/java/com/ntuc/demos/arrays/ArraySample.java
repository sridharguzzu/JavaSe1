package com.ntuc.demos.arrays;

/**
 * Demonstration of arrays
 *
 * @author Sridhar Guzzu
 */
public class ArraySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        array_sample();
    }
    
    static void array_sample(){
        //declare string array 
        String[] lang = {"french","english","german"};
        
        //declare integer array
        int[] arr = {1,3,6};
        
        // declare array without initializng
        String[] cars;
        String[] fruits;
        
        // Initialize array
        cars = new String[3];
        fruits = new String[]{"Apple","banana"};
        
        // Adding elements to Array
        cars[0]="BMW";
        cars[1]="Hyundai";
        
        //Accessing elements of an array
        System.out.println(lang[0]);
        System.out.println(arr[1]);
        System.out.println(cars[0]);
        System.out.println(fruits[0]);
    }
  }
