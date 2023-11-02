package src.string_java_mathAPI;

import java.time.LocalTime;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String nam1 = input.nextLine();
        String name = nam1 + " ";

        String hello =  "Hello ";
        String morning = "Good Morning";
        String afterNoon = "Good Afternoon";
        String evening  = "Good Evening";
        String night = "Good Night";


        LocalTime now = LocalTime.now();
        int hour= now.getHour();

        if (hour >= 0  && hour < 12){
            System.out.println(hello + name + morning);
        } else if (hour > 12 && hour < 18) {
            System.out.println(hello + name + afterNoon);
        } else if (hour  > 18 && hour < 22) {
            System.out.println(hello + name + evening );
        } else {
            System.out.println(hello + name + night);
        }
    }
}
