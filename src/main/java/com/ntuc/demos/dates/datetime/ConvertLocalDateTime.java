package com.ntuc.demos.dates.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author Sridhar Guzzu
 */
public class ConvertLocalDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldtc = LocalDateTime.of(2020, 3, 20, 23, 20, 0);
        System.out.println("The current date and time is : " + ldt);
        LocalDate ld = ldt.toLocalDate();
        LocalDate ld1 = ldtc.toLocalDate();
        
        Period p = Period.between(ld, ld1);
        Duration dur = Duration.between(ldt, ldtc);
        
        System.out.println(p.getDays()+" "+p.getMonths()+""+p.getYears());
        System.out.println(dur.getSeconds()
                +" "+dur.getSeconds()/60
                +" "+(dur.getSeconds()/60)/60
                +" "+(dur.getSeconds()/60)/60
                +" "+((dur.getSeconds()/60)/60)/24
        );

        
        

        
    }
}
