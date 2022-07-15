package com.ntuc.demos.dates.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Sridhar Guzzu
 */
public class InstantClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Instant i = Instant.now();
        System.out.println("Date and Time in UTC is :" + i);
        //Using the DateTimeFormatter
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy / MMM / dd z Z").withZone(ZoneId.systemDefault());
        String text = df.format(i);
        System.out.println("Formatted Instant output: "+ text);
        
        
        ZoneId zsg = ZoneId.of("Asia/Singapore");
        ZonedDateTime timeInSg = i.atZone(zsg);
        System.out.println("Date and Time in Singapore is :" + timeInSg);
        ZoneId zin = ZoneId.of("Asia/Calcutta");
        ZonedDateTime timeInInd = i.atZone(zin);
        System.out.println("Date and Time in India is :" + timeInInd);
    }
}
