package com.ntuc.demos.dates.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Sridhar Guzzu
 */
public class DateTimeFormatterClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Using the Constants in Java.time.format.DateTimeFormatter class
        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtfBasicIso = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter dtfIso = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter dtfIsoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formatDate = dtfBasicIso.format(ld);
        String formatDate1 = dtfIso.format(ld);
        String formatDate2 = dtfIsoLocalDateTime.format(ld.atStartOfDay());
        System.out.println(formatDate);
        System.out.println(formatDate1);
        System.out.println(formatDate2);
        System.out.println("__________________________________");

//         Read date from string using java.time.format.DateTimeFormatter class
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Please enter DoB as dd-MM-yyyy");
        String d = "21-03-2022";
        LocalDate today = LocalDate.parse(d,formatter);
        System.out.println(today);
        
        //Display dates in different locale
        DateTimeFormatter formatLocale = DateTimeFormatter.ofPattern("dd-MMM-yyyy").withLocale(Locale.FRENCH);
        LocalDate todayInFr = LocalDate.parse("21-mai-2022",formatLocale);
        System.out.println(todayInFr);
   }
}
