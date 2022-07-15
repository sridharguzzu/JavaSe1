package com.ntuc.demos.dates.datetime;

import java.time.ZoneId;
import java.util.Set;

/**
 *
 * @author Sridhar Guzzu
 */
public class ListTimeZones {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zone : zoneIds) {
            System.out.println(zone);
        }
    }
}
