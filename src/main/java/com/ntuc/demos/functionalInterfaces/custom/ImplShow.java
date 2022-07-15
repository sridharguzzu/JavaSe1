package com.ntuc.demos.functionalInterfaces.custom;

/**
 *
 * @author Sridhar Guzzu
 */
public class ImplShow {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Display<String> join = (i,j) -> i+j;
        Display<Integer> add = (x,y)->x+y;
        System.out.println(join.show("aaa", "bbb"));
        System.out.println(add.show(10,10));
    }
}
