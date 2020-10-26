package javacore.homework11.task1;

import java.util.Arrays;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
        Integer[] numbs = new Integer[10];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = ((int)(Math.random() * 10));
        }
        Arrays.sort(numbs);
        System.out.println(Arrays.deepToString(numbs));
        Arrays.sort(numbs, Collections.reverseOrder());
        System.out.println(Arrays.deepToString(numbs));
    }
}
