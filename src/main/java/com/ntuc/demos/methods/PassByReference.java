package com.ntuc.demos.methods;

/**
 *
 * @author Sridhar Guzzu
 */
public class PassByReference {

    int a = 10;

    void call(PassByReference pbr) {


        a = a + 10;
    }

    public static void main(String args[]) {
        PassByReference pbr = new PassByReference();
        System.out.println("Before call-by-Reference: " + pbr.a);

        pbr.call(pbr);
        System.out.println("After call-by-Reference: " + pbr.a);
    }
}
