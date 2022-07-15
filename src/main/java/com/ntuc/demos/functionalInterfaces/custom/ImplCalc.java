package com.ntuc.demos.functionalInterfaces.custom;


/**
 *
 * @author Sridhar Guzzu
 */
public class ImplCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Calculator<Integer> add = (a,b)->a+b;
        Calculator<Integer> sub = (a,b)->a-b;
        Calculator<Integer> mul = (a,b)->a*b;
        
        Calculator<String> join = (x,y)-> x+y;
        
        Calculator<Integer> a = (i,j)-> i*j;
        Integer x = a.operation(10,20);
        String s = join.operation("asd", "xyz");
        
        
        System.out.println(add.operation(10,20));
        System.out.println(sub.operation(10,20));
        System.out.println(mul.operation(10,20));
       
        System.out.println(join.operation("a","b"));
        
        
        
        
        
    }
}
