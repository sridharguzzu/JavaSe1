package com.ntuc.demos.dates.datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Sridhar Guzzu
 */
public class CalcAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LocalDate dob = LocalDate.of(1988, 12, 13);
        //obtains the current date from the system clock  
        LocalDate curDate = LocalDate.now();
        //calculates the difference betwween two dates  
        Period period = Period.between(dob, curDate);
        System.out.printf("Your age is %d years %d months and %d days.",
                period.getYears(),
                period.getMonths(),
                period.getDays());
    }
}
