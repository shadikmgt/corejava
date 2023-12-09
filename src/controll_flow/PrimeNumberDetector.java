package src.controll_flow;

import java.util.Scanner;

public class PrimeNumberDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a prime number : ");
        int num = scanner.nextInt();

        boolean isPrime = true;
        int i = 2;

//        for (int i = 2; i < num; i++){
//            if ( num % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
        while (i < num){
            if ( num % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime){
            System.out.println("The number " + num + " is a prime number.");
        } else {
            System.out.println("The number " + num + " is not a prime number.");
        }
    }
}
