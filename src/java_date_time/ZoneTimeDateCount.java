package src.java_date_time;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTimeDateCount {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
        System.out.println(time);
    }
}
