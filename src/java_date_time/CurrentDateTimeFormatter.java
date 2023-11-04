package src.java_date_time;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeFormatter {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssZZ");
        System.out.println(dateTime.format(formatter));

    }
}
