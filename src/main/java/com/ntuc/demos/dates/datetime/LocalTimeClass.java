package com.ntuc.demos.dates.datetime;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 *
 * @author Sridhar Guzzu
 */
public class LocalTimeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //using current time from LocalTime class
        LocalTime lt = LocalTime.now();
        System.out.println("Displaying current time using the localtime");
        System.out.println("-------------------------------------------");
        System.out.println(lt);
        System.out.println("Displaying current time feilds using the localtime");
        System.out.println("-------------------------------------------");
        System.out.println("  " + lt.getHour() + " Hours");
        System.out.println("  " + lt.getMinute() + " Minutes");
        System.out.println("  " + lt.getSecond() + " Seconds");
        System.out.println("  " + lt.getNano() + " NanoSeconds");
        System.out.println("-------------------------------------------");

        // Setting custom time using LocalTime class
        LocalTime ltc = LocalTime.of(9, 10, 10);
        System.out.println("The custom time set is ");
        System.out.println("  " + ltc);
        System.out.println("-------------------------------------------");

        // Local time in a different zone
        LocalTime ltz = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println("Time in Singapore is:" + ltz);
        ltz = LocalTime.now(Clock.systemUTC());
        System.out.println("UTC Time:" + ltz);
    }
}