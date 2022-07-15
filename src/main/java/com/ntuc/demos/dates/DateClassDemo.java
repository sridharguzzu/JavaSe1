package com.ntuc.demos.dates;

import java.util.Date;

/**
 *
 * @author Sridhar Guzzu
 */
public class DateClassDemo {

    /**
     * @param args the command line arguments
     */
    // Java.util.date intoduced in the year 1996 
    // with the Java version 1.0
    // calculates dates in relation to 00:00:00 on Jan 1st, 1970
    public static void main(String args[]) {
        Date d = new Date();
        double secs = d.getTime() / 1000;
        double mins = secs / 60;
        double hours = mins / 60;
        double days = hours / 24;
        double months = days / 30;
        double years = days / 365; // convert using days/365 for accuracy as not all //months have 30 days

        System.out.println("Since 00:00:00 from Jan 1st 1970 .. ");
        System.out.println(secs + " Seconds  Or");
        System.out.println(mins + " Minues  Or");
        System.out.println(hours + " Hours  Or");
        System.out.println(days + " Days  Or");
        System.out.println(months + " Months  Or");
        System.out.println(years + " Years");
        System.out.println(" have passed");
    }
}
