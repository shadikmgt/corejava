package src.generalprogram;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks 6 subjects one after another : ");
        double total = 0;

        total += sc.nextDouble();
        total += sc.nextDouble();
        total += sc.nextDouble();
        total += sc.nextDouble();
        total += sc.nextDouble();
        total += sc.nextDouble();

        double average = total / 6;
        double percentage = total / 600 * 100;
        System.out.println("Totals marks : " + total);
        System.out.println("Average marks : " + average);
        System.out.println("Percentage : " + percentage);
    }
}
