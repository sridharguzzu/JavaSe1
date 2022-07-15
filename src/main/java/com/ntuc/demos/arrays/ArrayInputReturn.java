package com.ntuc.demos.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayInputReturn {

    /**
     * @param args the command line arguments
     * @return
     */
    public String[] getArray() {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("Enter names and type done when you are finished:");
        while (!input.toLowerCase().equals("done")) {
            if (!input.equals("")) {
                names.add(input);
            }
            input = scan.next();
        }
        String[] arr = (String[]) names.toArray(new String[names.size()]);  
        return arr;

    }
}
