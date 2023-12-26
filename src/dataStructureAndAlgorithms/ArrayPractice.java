package src.dataStructureAndAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//        int arr[];
//
//        arr = new int[5];
//        arr[0] = 9;
//        arr[1] = 3;
//        arr[2] = 6;
//        arr[3] = 2;
//        arr[4] = 7;

//        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter arr 5 elements : ");
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int [5];
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate values in the array  is : ");

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }


    }

}
