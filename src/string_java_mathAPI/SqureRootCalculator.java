package src.string_java_mathAPI;

import java.util.Scanner;

public class SqureRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double rootNumber = Math.sqrt(number);
        System.out.println(rootNumber);
    }
}
