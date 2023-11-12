package src.java_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class MargeTwoList {
    public static <T> List<T> marge(List<T> first, List<T> second){
        List<T> marged = new ArrayList<>();
        marged.addAll(first);
        marged.addAll(second);
        return marged;
    }
    public static void main(String[] args) {
        MargeTwoList margeTwoList = new MargeTwoList();
        List <Integer>  first = new ArrayList<>();

        first.add(1);
        first.add(3);
        first.add(2);
        List <Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(5);
        list2.add(6);

        System.out.println(marge(first,list2));
//        List<Integer> firstList = new ArrayList<>();
//        firstList.add(1);
//        firstList.add(2);
//
//        List<Integer> secondList = new ArrayList<>();
//        secondList.add(3);
//        secondList.add(4);
//
//        // Call the static marge method and store the result in a new list
//        List<Integer> mergedList = marge(firstList, secondList);
//
//        // Print the merged list
//        System.out.println(mergedList);
    }


    }

