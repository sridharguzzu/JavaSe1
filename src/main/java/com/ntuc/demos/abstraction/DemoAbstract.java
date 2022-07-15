package com.ntuc.demos.abstraction;

/**
 *
 * @author Sridhar Guzzu
 */
public abstract class DemoAbstract {

    abstract public void validateApplicant();
    void showBalance(int acctNo){
        System.out.println("The balance in this account is a billion");
    }
}
