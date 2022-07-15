package com.ntuc.demos.dates.datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Sridhar Guzzu
 */
public class PeriodClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LocalDate firstDate = LocalDate.of(2010, 5, 17); // 2010-05-17
        LocalDate secondDate = LocalDate.of(2015, 3, 7); // 2015-03-07
        Period period = Period.between(firstDate, secondDate);

        int days = period.getDays(); // 18
        int months = period.getMonths(); // 9
        int years = period.getYears(); // 4
        boolean isNegative = period.isNegative(); // false

        System.out.println("The difference between:" + firstDate + " and " + secondDate + " is :");
        System.out.println(years + " Years");
        System.out.println(months + " Months");
        System.out.println(days + " Days");
    }
}
