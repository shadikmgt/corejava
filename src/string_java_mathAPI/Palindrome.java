package string_java_mathAPI;

import java.util.Scanner;

//import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inter a Name: ");
        String name = input.nextLine();

        boolean isPalindrame = true;

        for (int i = 0; i < name.length() / 2; i++ ){
            if(name.charAt(i) != name.charAt(name.length() - 1  -i)){
                isPalindrame = false;
                break;
            }
        }

        if (isPalindrame){
            System.out.println("This is plandrame.");
        }else {
            System.out.println("This is not a plandram.");
        }

    }
}
