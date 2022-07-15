package com.ntuc.demos.methods;

/**
 *
 * @author Sridhar Guzzu
 */
public class PassByValue {

    int a = 10;

    void call(int a) {
        a = a + 10;
    }

    public static void main(String args[]) {
        PassByValue eg = new PassByValue();
        System.out.println("Before call-by-value: " + eg.a);

        eg.call(20);
        System.out.println("After call-by-value: " + eg.a);
    }
}
