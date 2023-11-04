package src.java_date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverted {
    public static void main(String[] args){
        ZoneId torontoZoneId = ZoneId.of("America/New_York");
//        ZoneId losAnglesZoneId = ZoneId.of("America/Los_Angeles");
        ZoneId dhakaBdZoneId = ZoneId.of("Asia/Dhaka");

        ZonedDateTime dateTimeToronto = ZonedDateTime.now(torontoZoneId);
//        ZonedDateTime dateTimeLosAngeles = dateTimeToronto.withZoneSameInstant(losAnglesZoneId);
        ZonedDateTime dateTimeDhaka = dateTimeToronto.withZoneSameInstant(dhakaBdZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Toronto : " + dateTimeToronto.format(formatter));
//        System.out.println("Los Angeles : " + dateTimeLosAngeles.format(formatter));
        System.out.println("Dhaka : " + dateTimeDhaka.format(formatter));
    }
}
