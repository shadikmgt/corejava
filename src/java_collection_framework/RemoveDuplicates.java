package src.java_collection_framework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");
        list.add("banana");

        Set<String> set = new LinkedHashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println("List : " + list );
        System.out.println("Set" + set);
    }
}
