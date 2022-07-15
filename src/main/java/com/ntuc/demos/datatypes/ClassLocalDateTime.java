package com.ntuc.demos.datatypes;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

/**
 *
 * @author Sridhar Guzzu
 */
public class ClassLocalDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(" from DateDiff : main Method !!!! ");

        LocalDateTime curDate = LocalDateTime.now();
        LocalDateTime bDay = LocalDateTime.parse("1974-03-16T06:30:00");

        Period p = Period.between(bDay.toLocalDate(), curDate.toLocalDate());
        Duration d = Duration.between(bDay.toLocalTime(), curDate.toLocalTime());

        System.out.println(" Today Time " + curDate.toLocalTime());
        System.out.println(" BDay Time " + bDay.toLocalTime());
        System.out.println(" Today Date " + curDate.toLocalDate());
        System.out.println(" BDay Date " + bDay.toLocalDate());
        System.out.println("\n\tYou're " + p.getYears() + " yrs " + p.getMonths() + " months & " + p.getDays() + " days");
        System.out.println("\n\tand " + d.toHours() + " hours, " + d.toMinutes() + " mins & " + d.toSeconds() + " seconds old !!!\n\n ");

    }
}
