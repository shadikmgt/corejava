package src.generalprogram;

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character : " );
        char c = scanner.next().charAt(0);

        if (Character.isDigit(c)){
            System.out.println("The character is a number " + c);
        }else if (Character.isLetter(c)){
            System.out.println("The character is a letter " + c);
        }else {
            System.out.println("The character is a number " + c);
        }
    }
}
