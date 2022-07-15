package com.ntuc.demos.methods;

/**
 *
 * @author Sridhar Guzzu
 */
public class VarArgsStr {

    String res = "";

    public static void main(String args[]) {
        display();//zero argument 
        display("my", "name", "is", "Alex");//four arguments

    }

    static void display(String... values) {

        if (values.length > 0) {
            System.out.println("display method invoked ");
            for (int i = 0; i < values.length; i++) {
                System.out.println(values[i]);
            }
        } else {
            System.out.println("display method invoked ");
            System.out.println("No arguments passed");
        }

    }
}
