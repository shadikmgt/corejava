package src.java_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String [] args){
        List <Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            list.add(i);
        }

        List <Integer> subList = list.subList(2,6);
        System.out.println("Original list: " + list);
        System.out.println("Sublist : " + subList);
    }
}
