
package com.ntuc.demos.abstraction;

/**
 *
 * @author Sridhar Guzzu
 */
public class DemoExtendAbstract extends DemoAbstract{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        DemoExtendAbstract dea = new DemoExtendAbstract();
        dea.showBalance(1235);
    }

    @Override
    public void validateApplicant() {
        System.out.println("The applicant is valid");
    }
}
