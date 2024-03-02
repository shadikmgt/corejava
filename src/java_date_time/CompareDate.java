package src.java_date_time;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class CompareDate {
    public static void main(String[] args) {
//        LocalDate date1 = LocalDate.of(2023, 11, 3);
//        LocalDate date2 = LocalDate.of(2023, 11, 10);
//
//        int result = date1.compareTo(date2);
//
//        if (result == 0){
//            System.out.println("The dates are equals.");
//        } else if (result > 0) {
//            System.out.println("Date1 is greater.");
//        }else {
//            System.out.println("Date2 is less than date1.");
//        }

        LocalDate date1 = LocalDate.of(2023, Month.FEBRUARY, 10);
        LocalDate date2 = LocalDate.of(2024, Month.AUGUST, 10);

        int days = date1.compareTo(date2);

        if (days == 0){
            System.out.println("Those are equal days");
        } else if (days > 0) {
            System.out.println("Day1 is greater than day two.");
        } else {
            System.out.println("Day2 is greater than day one.");
        }

    }
}
