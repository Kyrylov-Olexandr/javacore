package javacore.homework10.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vowels = "(?i:[aeiou])";
        System.out.print("Enter word: ");
        String input = scanner.nextLine();
        String noVowels = input.replaceAll(vowels, "-");
        System.out.println(noVowels);




    }

}
