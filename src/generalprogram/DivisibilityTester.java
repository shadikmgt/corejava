package src.generalprogram;

import java.util.Scanner;

public class DivisibilityTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = scanner.nextInt();

        if (n % 5 == 0 && n % 6 == 0){
            System.out.println(n + " is divisible by both 5 and 6.");
        } else if (n % 5 == 0 ) {
            System.out.println(n + " is divisible by 5.");
        } else if (n % 6 == 0 ) {
            System.out.println(n + " is divisible by 6");
        }else {
            System.out.println(n + " is not divisible by both 5 and 6.");
        }
    }
}
