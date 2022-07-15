package com.ntuc.demos.maps;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String[] namesData
                = 
                {"Jane", "Addams",
                    "Muhammad", "Ali",
                    "Stephen", "Ambrose",
                    "Louis", "Armstrong",
                    "Joan", "Baez",
                    "Josephine", "Baker",
                    "Eleanor", "Roosevelt",
                    "Frank", "Sinatra",};
        String[] firstNames = new String[namesData.length];
        String[] lastNames = new String[namesData.length];

        for (int i = 0; i < namesData.length; i++) {
            if (i % 2 == 0) {
                firstNames[i / 2] = namesData[i];
            } else {
                lastNames[i / 2] = namesData[i];
            }
        }

        Map<String, String> fullNames = new HashMap<>();
        for (int i = 0; i < firstNames.length; i++) {
            fullNames.put(firstNames[i], lastNames[i]);
        }

        System.out.println(fullNames.get("Joan"));

    }
}
