package com.ntuc.demos.dates.datetime;

import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author Sridhar Guzzu
 */
public class YearClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Year currentYear = Year.now();
        Year custom = Year.of(2000);
        boolean isLeap = currentYear.isLeap(); // false
        int length = currentYear.length(); // 365

        // sixtyFourth day of 2014 (2014-03-05)
        LocalDate date = Year.of(2014).atDay(64);

        System.out.println("year: currentYear: " + currentYear);
        System.out.println("year: custom: " + custom);
        System.out.println("year: isLeap: " + isLeap);
        System.out.println("year: length: " + length);
        System.out.println("year: date: " + date);
        System.out.println("The 64th day of 2014 is: "+ date);
    }
}
