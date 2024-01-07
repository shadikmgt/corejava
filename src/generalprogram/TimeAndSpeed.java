package src.generalprogram;

import java.util.Scanner;

public class TimeAndSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance;
        int time;
        System.out.println("Enter distance in meter : ");
        distance = input.nextInt();

        System.out.println("Enter time in minutes : ");
        time = input.nextInt();

        //converting distance in km
        double distanceInKm = distance / 1000;
        double timeInHour = time * 60;

        double speed = distanceInKm / timeInHour;
        System.out.println("Speed is : %.2f km/s " + speed);

    }
}
