package src.dataStructureAndAlgorithms;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println(arr.length);

        //input of the array

        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//        //output of the array
//        for(int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output for enhance for loop

//        for (int[] a : arr){
//            System.out.print(Arrays.toString(a));
//            System.out.println();
//        }

        //another way of output
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }




    }
}
