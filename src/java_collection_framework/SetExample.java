package src.java_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class SetExample {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            list.add(i);
        }
        System.out.println("Original list : " + list);
        list.set(2,100);
        System.out.println("Modified list : " + list);
    }
}
