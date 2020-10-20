package javacore.homework10.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws TooManyCharactersException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word: ");
        String input = scanner.nextLine();


        if (input.length() > 5) {
            throw new TooManyCharactersException(input);
        } else {
            String a = input.substring(0,2);
            String b = new StringBuilder(input.substring(3,5)).reverse().toString();
            System.out.println(a.equalsIgnoreCase(b) ? "Word is palindrome" : "Word isn't palindrome");
        }


    }

}
