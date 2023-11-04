package src.java_date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneIdFinder {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Toronto");

        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);
        String id = dateTime.getZone().getId();
        System.out.println(id);
    }
}
