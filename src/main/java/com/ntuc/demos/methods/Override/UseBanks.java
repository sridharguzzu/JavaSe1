package com.ntuc.demos.methods.Override;

/**
 *
 * @author Sridhar Guzzu
 */
public class UseBanks {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UOB ub = new UOB();
        DBS db = new DBS();
        MayBank mb = new MayBank();

        System.out.println("UOB's Interest Rate is: " + ub.getInterestRate() + "%");
        System.out.println("BBS's Interest Rate is: " + db.getInterestRate() + "%");
        System.out.println("MyBanks's Interest Rate is: " + mb.getInterestRate() + "%");
    }
}
