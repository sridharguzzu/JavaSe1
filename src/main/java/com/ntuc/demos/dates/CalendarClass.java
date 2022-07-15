package com.ntuc.demos.dates;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Sridhar Guzzu
 */
public class CalendarClass {

    /**
     * @param args the command line arguments
     */
    // introduced in Java 1.1
    // In the year 1997
    // This introduction made a lot of Date class contructors and methods deprecated
    //Calendar class is an abstract class
    public static void main(String args[]) {
        Calendar c = Calendar.getInstance();
        System.out.println("Year is    :" + c.get(Calendar.YEAR));
        System.out.println("Month is    :" + c.get(Calendar.MONTH));
        System.out.println("Date is    :" + c.get(Calendar.DATE));
        System.out.println("Hour is    :" + c.get(Calendar.HOUR));
        System.out.println("Minute is    :" + c.get(Calendar.MINUTE));
        System.out.println("Second is    :" + c.get(Calendar.SECOND));

        System.out.println("Full Date is: " + c.getTime());

        //Set date using Calendar
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.YEAR, 1975);
        c1.set(Calendar.MONTH, 5);
        c1.set(Calendar.DATE, 1);
        System.out.println("Full custom Date is: " + c1.getTime());

        //set custom Date and time
        Calendar c2 = Calendar.getInstance();
        c2.set(1984, 2, 16);
        c2.set(Calendar.HOUR_OF_DAY, 0);
        c2.set(Calendar.MINUTE, 0);
        c2.set(Calendar.SECOND, 0);
        System.out.println("Full custom Date with time is: " + c2.getTime());

        // check the dates with before or after
        boolean b = c.before(c2);
        System.out.println(b);
        System.out.println(c2.before(c));

        //clone Date
        Calendar c3 = (Calendar) c2.clone();
        System.out.println("Full custom Date with time is: " + c3.getTime());

        // View Time zones
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getDisplayName());

        //Set Timezone
        System.out.println("Setting Time Zone to Singapore");
        c.setTimeZone(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getDisplayName());
        
        // The calendar class can only display the time zone 
        // the time conversion has to be done programatically.

    }
}
