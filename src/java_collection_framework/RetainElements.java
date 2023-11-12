package src.java_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class RetainElements {
    public static void main(String[] args) {
        List <String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");
        list1.add("mango");
        list1.add("grapes");


        List <String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("mango");
        list2.add("strawberry");
        list2.add("blueberry");

        list1.retainAll(list2);
        System.out.println(list1);
    }
}
