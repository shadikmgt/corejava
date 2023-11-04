package src.java_date_time;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZoneOffsetFinder {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Dhaka");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        ZoneOffset offset = zonedDateTime.getOffset();
        System.out.println(offset);

    }
}
