package src.dataStructureAndAlgorithms;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int arr[];

        arr = new int[5];
        arr[0] = 9;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 2;
        arr[4] = 7;

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            System.out.println("Index of " + i + " elements is =  " + arr[i] );
        }
    }

}
