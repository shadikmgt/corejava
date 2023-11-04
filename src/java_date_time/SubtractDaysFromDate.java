package src.java_date_time;

import java.time.LocalDate;
import java.time.ZoneId;

public class SubtractDaysFromDate {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Dhaka");

        LocalDate currentDate = LocalDate.now(zoneId);
        int subtractDays = 10;

        LocalDate newDate = currentDate.minusDays(subtractDays);
        System.out.println(newDate);
    }
}
