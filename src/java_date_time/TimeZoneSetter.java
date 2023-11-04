package src.java_date_time;

import java.time.LocalDate;
import java.util.TimeZone;

public class TimeZoneSetter {
    public static void main(String[] args) {
        TimeZone newYorkTimeZone = TimeZone.getTimeZone("America/New_York");
        System.out.println("New York Time Zone: " + newYorkTimeZone.getDisplayName());
    }
}
