package src.generalprogram;

import java.util.Scanner;

public class CountingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int i;

        System.out.println("Enter a number : ");
        num = scanner.nextInt();
        i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while(i <= num);
    }
}
