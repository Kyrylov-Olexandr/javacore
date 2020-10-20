package javacore.homework10.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = scanner.nextLine();
        String [] wordsArr = input.split(" ");
        System.out.println(wordsArr.length);

    }

}
