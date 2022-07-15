package com.ntuc.demos.dates.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Sridhar Guzzu
 */
public class DurationClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldtc = LocalDateTime.of(2020, 3, 20, 23, 20, 0);

        Duration dur = Duration.between(ldtc, ldt);
        System.out.println(dur);
        long days = dur.toDays();
        System.out.println("number of days between: " + ldt + " and " + ldtc + " is " + days + " days");
    }
}
