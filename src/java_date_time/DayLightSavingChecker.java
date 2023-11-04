package src.java_date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DayLightSavingChecker {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Toronto");
        ZonedDateTime dateTime =ZonedDateTime.now(zoneId);

        boolean isDis = zoneId.getRules().isDaylightSavings(dateTime.toInstant());
        System.out.println(isDis);
    }
}
