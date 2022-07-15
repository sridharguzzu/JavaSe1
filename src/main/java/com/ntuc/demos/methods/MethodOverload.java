package com.ntuc.demos.methods;

/**
 *
 * @author Sridhar Guzzu
 */
public class MethodOverload {

    /**
     * @param args the command line arguments
     */
    
    void sum(int a, int b){
        System.out.println(a+b);
    }
    
    void sum(float a, float b){
        System.out.println(a+b);
    }
    
    public static void main(String args[]) {
        MethodOverload mor = new MethodOverload();
        mor.sum(5,5);
        mor.sum(5.5f,5.5f);
    }
}
