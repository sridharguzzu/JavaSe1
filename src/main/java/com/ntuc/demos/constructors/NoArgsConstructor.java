package com.ntuc.demos.constructors;

/**
 *
 * @author Sridhar Guzzu
 */
public class NoArgsConstructor {

    int i = 0;

    /**
     * @param args the command line arguments
     */
    public NoArgsConstructor() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String args[]) {
        NoArgsConstructor nac = new NoArgsConstructor();
        System.out.println("Value f i: " + nac.i);
    }
}
