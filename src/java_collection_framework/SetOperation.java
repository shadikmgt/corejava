package src.java_collection_framework;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set <Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        set2.removeAll(set1);
        System.out.println(set2);
    }
}
