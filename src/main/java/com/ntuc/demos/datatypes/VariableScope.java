package com.ntuc.demos.datatypes;

/**
 *
 * @author Sridhar Guzzu
 */
public class VariableScope {

    //Declaration of Instance VariableScope
    // need not be instantiated
    int InstanceVariable;
    static int StaticInstanceVariable = 20;

    public void NonStaticMethod() {
        //Declaration of a local variable
        //needs initialization
        int LocalVariable = 10;
        System.out.println("Accessing values of variables in a Non Static Method");
        System.out.println("----------------------------------------------------");
        System.out.println("   Value of InstanceVariable is: " + InstanceVariable);
        System.out.println("   Value of StaticInstanceVariable is: " + StaticInstanceVariable);
        System.out.println("   Value of LocalVariable is: " + LocalVariable + "\n");
    }

    public static void StaticMethod() {
        int LocalVariable = 10;
        System.out.println("Accessing values of variables in a Static Method");
        System.out.println("----------------------------------------------------");
//         System.out.println("Value of InstanceVariable is: " + InstanceVariable);
        System.out.println("   Value of StaticInstanceVariable is: " + StaticInstanceVariable);
        System.out.println("   Value of LocalVariable is: " + LocalVariable);
    }

    public static void main(String[] args) {
        VariableScope v = new VariableScope();
        v.NonStaticMethod();
        StaticMethod();
    }

}
