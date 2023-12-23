package src.dataStructureAndAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
//        BinarySearch binarySearch = new BinarySearch();
//
//        int arr[] = {2,4,6,7,8,9,11,24,25,27,28,29};
//        int x = 9;
//        int result = binarySearch.binarySearch(arr, x);
//
//        if (result == -1){
//            System.out.println(x + " Elements not found in the array.");
//        }else {
//            System.out.println( x + " elements is found in the array at index no " + result);
//        }
    BinarySearch binarySearch = new BinarySearch();

        int arr[] = {1,3,4,5,6,7,8,9,11,12,13,15,16,23,24,26,27};
        int x = 5;
        int result = binarySearch.binarySearch(arr, x);
        if (result == -1){
            System.out.println("The element " + x + " is not found in the array."   );
        } else {
            System.out.println(" The element " + x + " is found in the index number " + result);
        }

    }

//    public int binarySearch(int arr[], int x){
//        int l = 0;
//        int r = arr.length - 1;
//
//        while (l <= r){
//            int m = l + (r - l) / 2;
//            if (arr[m] == x){
//                return m;
//            }
//            if (arr[m] < x){
//                l = m + 1;
//            } else {
//                r = m - 1;
//            }
//        }
//        return -1;
//    }

    public int binarySearch(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x){
                return m;
            }
            if (arr[m] < x){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return  -1;
    }
}
