
package com.ntuc.demos.interfaces;

/**
 *
 * @author Sridhar Guzzu
 */
public interface Bank {
    float fixedDeposit(float amt,int months);
    float recurringDeposit(float amt,int months);
}

// boolean acceptApplicant(int age, String rstatus, int typeofaccount)