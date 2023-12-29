package src.generalprogram;

import java.util.Scanner;

public class FeboNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = 0;
        int num2 = 1;
        int num3;

        int input = in.nextInt();
        System.out.println( num1 +  ' ' + num2);
        for (int i = 2; i < input; i++){
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }

    }
}
