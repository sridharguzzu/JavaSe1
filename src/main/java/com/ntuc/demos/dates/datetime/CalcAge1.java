package com.ntuc.demos.dates.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Sridhar Guzzu
 */
public class CalcAge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LocalDate bday = LocalDate.of(1974, Month.MARCH, 16);
        // Method one using the ISO Chronolgy
        System.out.println(bday.until(IsoChronology.INSTANCE.dateNow()));
        
        // Method 2 using the Untethod in LocalDate
        System.out.println(bday.until(LocalDate.now(), ChronoUnit.YEARS));
        System.out.println(bday.until(LocalDate.now(), ChronoUnit.MONTHS));
        System.out.println(bday.until(LocalDate.now(), ChronoUnit.DAYS));
    }
}
