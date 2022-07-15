package com.ntuc.demos.operators;

/**
 *
 * @author Sridhar Guzzu
 */
public class OperatorPrecedence {

    /*
    Rules of precedence:
1. Operators within a pair of parentheses
2. Increment and decrement operators (++ or --)
3. Multiplication and division operators, evaluated from left to right
4. Addition and subtraction operators, evaluated from left to right
     */
    public static void main(String args[]) {
        int a = (((25 - 5) * 4) / (2 - 10)) + 4;
        int b = ((20 * 4) / (2 - 10)) + 4;
        int c = (80 / (2 - 10)) + 4;
        int d = (80 / -8) + 4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
