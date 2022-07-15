package com.ntuc.demos.dates.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author Sridhar Guzzu
 */
public class LocalDateTimeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // class which handles dates and times
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("The current date and time is : " + ldt);

        // custom Local date and time.
        LocalDateTime ldtc = LocalDateTime.of(2020, 3, 20, 23, 20, 0);
        System.out.println("The custom date and time is : " + ldtc);
        
               
        // accessing components of custom date
        System.out.println("-----------------------------------------");
        System.out.println("  Date is:  " + ldtc.getDayOfMonth());
        System.out.println("  Month is: " + ldtc.getMonth());
        System.out.println("  Year is: " + ldtc.getYear());
        System.out.println("  Hour is: " + ldtc.getHour());
        System.out.println("  Minutes: " + ldtc.getMinute());
        System.out.println("  Seconds: " + ldtc.getSecond());
    }
}
