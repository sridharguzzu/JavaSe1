package com.ntuc.demos.functionalInterfaces.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author Sridhar Guzzu
 */
public class StreamsWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            String[] arr = {"one", "two","three"};
            Stream<String> stream = Arrays.stream(arr);
            stream.forEach(i->System.out.println(i.toUpperCase()+" "));
    }
}
