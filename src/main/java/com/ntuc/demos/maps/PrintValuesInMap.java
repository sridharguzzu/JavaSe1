package com.ntuc.demos.maps;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class PrintValuesInMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Map<Integer, String> data = new HashMap<>();
        
        data.put(1, "david");
        data.put(2, "Alex");
        data.put(3, "Simon");

        System.out.println(data.keySet().toString() + " " + data.values().toString());
        String s = data.get(1);
        System.out.println(s);

        
    }
}
