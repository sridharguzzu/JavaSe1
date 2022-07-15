package com.ntuc.demos.dates;

import java.util.Date;

/**
 *
 * @author Sridhar Guzzu
 */
public class DateConstruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Deprecated Constructor Date(int year, int month, int Date) creates a date as 
        year - a year after 1900
        month - a month between 0-11
        date - day of the month between 1-31*/

        Date d = new Date(0, 0, 0);
        System.out.println(d); // outputs Sun Dec 31 00:00:00 IST 1899
        Date d1 = new Date(0, 0, 1); // outputs the date as Mon Jan 01 00:00:00 IST 1900
        System.out.println(d1); // outputs Sun Dec 31 00:00:00 IST 1899
        System.out.println(d.getTime()); // gives negative number -2209095000000
        
        //to create a date as  1st June 1974 deprecated constructor
        Date test = new Date(74,5,1);
        System.out.println(test);
    }
}
