package src.java_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ListSplitter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grapes");
        list.add("kiwi");

        int size = 2;
        List<List<String>> sublists = new ArrayList<>();
        for (int i = 0; i < list.size(); i += size){
            sublists.add(
                    list.subList(i, Math.min(i + size, list.size()))
            );
        }
        for (List<String> sublist : sublists){
            System.out.println(sublist);
        }
    }
}
