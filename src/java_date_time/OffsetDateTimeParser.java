package src.java_date_time;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeParser {
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ssVV";
    public static void main(String[] args) {
        String str = "2023-11-04 11:54:34+01:00";
        OffsetDateTime dateTime = parseOffSetDateTime(str);
        System.out.println(dateTime);
    }
    public static OffsetDateTime parseOffSetDateTime(String str){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);
        return OffsetDateTime.parse(str,formatter);
    }

}
