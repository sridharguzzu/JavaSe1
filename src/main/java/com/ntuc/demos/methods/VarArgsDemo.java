package com.ntuc.demos.methods;

/**
 *
 * @author Sridhar Guzzu
 */
public class VarArgsDemo {

    /**
     * @param args the command line arguments
     */
    
    static void ElementCount(int... x){
        System.out.println("Number of arguments passed is: " + x.length);
    }
    
    static void ShowElements(char... c){
        for (int arg = 0; arg < c.length; arg++) {
            System.out.println(c[arg]);
        }
    }
    
    public static void main(String args[]) {
            ElementCount(10,20);
            ShowElements('a','b');
                    
            ElementCount(10,20,30);
            ShowElements('a','b','c');
            
            ElementCount(10,20,40,10);
            ShowElements('a','b','c','d');
            
            ElementCount(10,20,50,30,4);
            ShowElements('a','b','c','d','e');
            
            ElementCount(10,20,50,60,70,80,88,99,100);
            ShowElements('a','b','c','d','e','r','f','g','j');
    }
    
    
}
