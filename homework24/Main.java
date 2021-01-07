package javacore.homework24;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Cinema cinema = new Cinema();
    private static Menu menu = new Menu();
    private static Scanner scanner = new Scanner(System.in);
    private static Days days;


    public static void main(String[] args) {
       while (true) {
           menu.main();
       }
    }
}

