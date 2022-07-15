package com.ntuc.demos.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayListInput {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();
        String input = "";
        while (!input.toLowerCase().equals("done")) {
            if (!input.equals("")) {
                cities.add(input);
            }
            input = scan.next();
        }
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        String[] arr = (String[]) cities.toArray(new String[cities.size()]);  // Object[]
//        System.out.println(arr.length);
    }
}
