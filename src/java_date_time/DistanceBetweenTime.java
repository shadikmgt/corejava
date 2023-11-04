package src.java_date_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class DistanceBetweenTime {
    public static Duration getDuration(LocalDateTime start, LocalDateTime end){
        Duration duration = Duration.between(start,end);
            return duration;
    }
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2023,11,4,10,0,0);
        LocalDateTime end = LocalDateTime.of(2023,11, 4, 12, 30,23);

        Duration duration = getDuration(start,end);
        System.out.println(duration);
    }
}
