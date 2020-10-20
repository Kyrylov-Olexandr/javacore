package javacore.homework10.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentences: ");
        String input = scanner.nextLine();
        String[] sentencesArr = input.split("[?!.]");
        System.out.println(sentencesArr.length);

    }

}
