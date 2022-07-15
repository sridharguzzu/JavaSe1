package com.ntuc.demos.constructors;

/**
 *
 * @author Sridhar Guzzu
 */
public class ConstructorWithArgs {

    String language;

    public ConstructorWithArgs(String l) {
        language = l;
        System.out.println(language + " Is a programming lanuage");
    }

    public static void main(String args[]) {
        ConstructorWithArgs l1 = new ConstructorWithArgs("Java");
        ConstructorWithArgs l2 = new ConstructorWithArgs("Python");
        ConstructorWithArgs l3 = new ConstructorWithArgs("C");
    }
}
