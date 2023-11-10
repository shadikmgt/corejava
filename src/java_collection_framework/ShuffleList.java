package src.java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {

    public static void main(String[] args){
        List <Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println("Shuffle List : " + list);
    }
}
