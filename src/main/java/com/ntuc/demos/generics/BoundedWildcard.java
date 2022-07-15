package com.ntuc.demos.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sridhar Guzzu
 */
public class BoundedWildcard {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
//        showList(list1);
        
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        showAny(list2);
        showAny(list1);
    }

    // Generic method to show Integer list
    static void showList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
    
    static void showAny(List<?> list){
        for (Object object : list) {
            System.out.println(object);
        }
        
    }
}
