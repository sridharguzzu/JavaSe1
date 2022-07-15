package com.ntuc.demos.arrays;

/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayClone1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String[] names = {"David", "Alex"};
        String[] cArray = names.clone();
        for (int i = 0; i < cArray.length; i++) {
            System.out.println(cArray[i]);
        }

        names[0] = "Simon";
        names[1] = "Mike";
        
        // Print Original Array after the change
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
        // Print cloned Array after the change
        for (int i = 0; i < cArray.length; i++) {
            System.out.println(cArray[i]);
        }
        
        
        
        
    }
}
