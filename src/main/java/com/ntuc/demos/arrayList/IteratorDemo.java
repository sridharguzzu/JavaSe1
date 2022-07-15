package com.ntuc.demos.arrayList;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class IteratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<String> listString = new ArrayList<>();

        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");
        listString.add("Five");

        Iterator iterator = listString.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
