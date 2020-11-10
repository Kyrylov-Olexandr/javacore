package javacore.homework18.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addToList(list);
        System.out.println(list.get(0) + "\n" + list.get(1));
    }

    static void addToList(List list) {
        list.add("1");
        list.add("ф");
    }


}
