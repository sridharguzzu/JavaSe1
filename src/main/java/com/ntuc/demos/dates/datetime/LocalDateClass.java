package com.ntuc.demos.dates.datetime;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Sridhar Guzzu
 */
public class LocalDateClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //getting the current date
        LocalDate ld = LocalDate.now();
        System.out.println("Displaying the current date");
        System.out.println(ld);
        System.out.println("Displaying the current date feilds");
        System.out.println("  " + ld.getDayOfMonth());
        System.out.println("  " + ld.getMonth());
        System.out.println("  " + ld.getYear());
        System.out.println("-------------------------------------------------");

        // setting at custom date
        LocalDate ldc = LocalDate.of(2021, 1, 1);
        System.out.println("Displaying the Custom date ");
        System.out.println(ldc);
        System.out.println("Displaying the Custom date feilds");
        System.out.println("  " + ldc.getDayOfMonth());
        System.out.println("  " + ldc.getMonth());
        System.out.println("  " + ldc.getYear());
        System.out.println("-------------------------------------------------");

        // Date with time
        LocalDate ldt = LocalDate.of(2022, Month.MARCH, 10);
        System.out.println("Date along with the time :" + ldt.atTime(10, 00));
        System.out.println("-------------------------------------------------");
        
        // Adding to the date
        LocalDate lda = LocalDate.of(2020, 3, 22);
        System.out.println("The date set is : " + lda);
        System.out.println("Using the plus methods in the LocalDate class");
        System.out.println("  The date after 10 days is: " + lda.plusDays(10));
        System.out.println("  The date after 1 week is: " + lda.plusWeeks(1));
        System.out.println("  The date after 1 Month is: " + lda.plusMonths(1));
        System.out.println("-------------------------------------------------");
        System.out.println("The date set is : " + lda);
        System.out.println("Using the minus methods in the LocalDate class");
        System.out.println("  The date before 10 days is: " + lda.minusDays(10));
        System.out.println("  The date before 1 week is: " + lda.minusWeeks(1));
        System.out.println("  The date before 1 Month is: " + lda.minusMonths(1));
        System.out.println("-------------------------------------------------");
    }
}
