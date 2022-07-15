package com.ntuc.demos.methods.Override;

/**
 *
 * @author Sridhar Guzzu
 */
public class MayBank extends Bank {

    /**
     * @param args the command line arguments
     */
    @Override int getInterestRate() {
        return 6;
    }
}
