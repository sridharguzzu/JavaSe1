package com.ntuc.demos.exceptions.customexceptions;

/**
 *
 * @author Sridhar Guzzu
 */
public class TestException {

    static void testage(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age entered");
        } else {
            System.out.println("Validated and accepted");
        }
    }

    public static void main(String args[]) {

        try {
            testage(12);
        } catch (InvalidAgeException ina) {
            System.out.println(ina.getMessage());
        }

    }
}
