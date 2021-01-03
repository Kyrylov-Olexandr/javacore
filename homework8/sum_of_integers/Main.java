package javacore.homework8.sum_of_integers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String a = scanner.nextLine();
            if (!a.equals("q")) {
                String b = scanner.nextLine();
                if (!b.equals("q")) {
                    System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }
}

